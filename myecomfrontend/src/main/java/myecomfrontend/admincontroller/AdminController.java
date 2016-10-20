package myecomfrontend.admincontroller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import myecom.dao.ProductDAO;
import myecom.models.Product;

@Controller
@RequestMapping("/admin")

/*
 * we are adding the /admin for all admin work so whenever admin add, remove,or
 * view the record so url will be /admin/yourmapping
 * 
 */
public class AdminController {

	List<Product> product;
	@Autowired
	ProductDAO productDao;

	/*
	 * display all the record to admin and sent the blank pid object to spring
	 * form & it'll also mapped with insertion and update/edit through
	 */

	@RequestMapping(value = "/viewall", method = RequestMethod.GET)
	public ModelAndView viewAllProductsAdmin() {
		ModelAndView modelAndView = new ModelAndView("adminview/Admin_View");
		modelAndView.addObject("productData", productDao.getAllProduct());
		modelAndView.addObject("pid", new Product());
		return modelAndView;
	}

	// @RequestMapping(value = "/viewall", method = RequestMethod.GET)
	// public String listPersons(Model model) {
	// model.addAttribute("productData", productDao.getAllProduct());
	// model.addAttribute("newProduct", new Product());
	// return "adminview/Admin_View";
	// }

	/*
	 * this method is use to insert and update both
	 * 
	 * if productId will be 0 product will insert else it'll update we are
	 * using @ModelAtteribute annotation which will map with our spring form it
	 * must be same as you model class attribute. if it's not you'll get the
	 * error.
	 * 
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertProduct(@ModelAttribute("productId") Product product,HttpServletRequest request) {

		if (product.getProductId() == 0) {
			productDao.insertProduct(product);
			
			
			MultipartFile file = product.getFile();
			
			String originalfile = file.getOriginalFilename();
			
			String filepath = request.getSession().getServletContext().getRealPath("/resources/images/productimages/");
			
			String filename = filepath + "\\" + product.getProductId() + ".jpg";
			System.out.println("File Path File "+filepath);
			
			try {
				byte imagebyte[] = product.getFile().getBytes();
				BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filename));
				fos.write(imagebyte);
				fos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			
		} else {
			productDao.updateProduct(product);
		}

		return "redirect:/admin/viewall";
//		return "adminview/Admin_View";
	}

	/*
	 * if the mapping is edit/withid so, all data after clicking on edit button
	 * will show in the form so that's why we are returning the our page to
	 * ViewResolver it'll return the same page with data but not refresh the
	 * data from form.
	 * 
	 * 
	 */
	@RequestMapping("/edit/{id}")
	public String editProduct(@PathVariable("id") int id, Model model) {

		model.addAttribute("pid", productDao.getProductById(id));
		model.addAttribute("productData", productDao.getAllProduct());
		return "adminview/Admin_View";
	}

	/*
	 * it's removing data using id. and deleteProductById(id) defined in DAO.
	 */
	@RequestMapping("/remove/{id}")
	public String removeProduct(@PathVariable("id") int id) {
		productDao.deleteProductById(id);
		return "redirect:/admin/viewall";
	}

	// @RequestMapping("/remove/{id}")
	// public ModelAndView removeProduct(@PathVariable("id") int id){
	// productDao.deleteProductById(id);
	// ModelAndView modelAndView = new ModelAndView("adminview/Admin_View");
	// modelAndView.addObject("pid", productDao.getProductById(id));
	// modelAndView.addObject("productData", productDao.getAllProduct());
	// return modelAndView;
	// }

	// @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	// public ModelAndView adminEditProduct(@PathVariable("id") int id) {
	//
	// ModelAndView mv = new ModelAndView("adminview/Admin_View");
	// mv.addObject("ifAdminClickedProduct",true);
	// mv.addObject("product", productDao.getProductById(id));
	// mv.addObject("products", productDao.getAllProduct());
	// return mv;
	//
	// }

}

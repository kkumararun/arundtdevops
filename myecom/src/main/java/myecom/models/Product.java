package myecom.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.multipart.MultipartFile;

//import org.springframework.we

@Entity
@Table(name = "ProductData")
@ComponentScan(basePackages="myecom")
public class Product {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int productId;

	//we are declaring is as transient because we don't want to store file into database
@Transient	
MultipartFile file;
	
	
	public MultipartFile getFile() {
	return file;
}

public void setFile(MultipartFile file) {
	this.file = file;
}

	@NotNull
	@Column(name = "product_name")
	private String productName;

	@NotNull
	@Column(name = "product_brand")
	private String productBrand;

	@NotNull
	@Column(name = "product_category")
	private String productCategory;

	public int getProductId() {
		return productId;// "PRID"+UUIDGenerationStrategy.randomUUID();//productId;

	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productBrand=" + productBrand
				+ ", productCategory=" + productCategory + "]";
	}

}

package myecom.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myecom.models.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO{

	
	@Autowired
	private SessionFactory session;
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProduct() {
		return session.getCurrentSession().createQuery("from Product").list();
	}

	@Override
	public void insertProduct(Product p) {
		session.getCurrentSession().persist(p);
		
	}

	
	
}

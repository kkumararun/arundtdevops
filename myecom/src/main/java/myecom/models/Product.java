package myecom.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.UUIDGenerationStrategy;

@Entity
@Table(name="ProductData")
public class Product {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@GenericGenerator(name = "uuid", strategy = "uuid2")
		private String productId;
	
	@NotNull
	@Column(name="product_name")
	private String productName;
	
	@NotNull
	@Column(name="product_brand")
	private String productBrand;
	
	@NotNull
	@Column(name="product_category")
	private String productCategory;

	public String getProductId() {
		
		return "PID"+productId;//"PRID"+UUIDGenerationStrategy.randomUUID();//productId;
		
	}

	public void setProductId(String productId) {
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

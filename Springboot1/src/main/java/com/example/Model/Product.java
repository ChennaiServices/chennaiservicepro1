package com.example.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Product")

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3545034539449839519L;

	@Id
	@Column(name="ProductId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ProducId;
	
	@Column(name="ProductPrice")
	private long ProductPrice;
	
	@Column(name="ProductName")
	private String ProductName;
	
	@Column(name="ProductDesc")
	private String ProductDesc;
	
	@Column(name="ProductPicUrl")
	private String ProductPicUrl;
	public long getProducId() {
		return ProducId;
	}
	public void setProducId(long producId) {
		ProducId = producId;
	}
	public long getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(long productPrice) {
		ProductPrice = productPrice;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductDesc() {
		return ProductDesc;
	}
	public void setProductDesc(String productDesc) {
		ProductDesc = productDesc;
	}
	public String getProductPicUrl() {
		return ProductPicUrl;
	}
	public void setProductPicUrl(String productPicUrl) {
		ProductPicUrl = productPicUrl;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Product(long producId, long productPrice, String productName, String productDesc, String productPicUrl) {
		super();
		ProducId = producId;
		ProductPrice = productPrice;
		ProductName = productName;
		ProductDesc = productDesc;
		ProductPicUrl = productPicUrl;
	}
	public Product()
	{
		
	}
	
	
	

}

package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table (name="Prods")
public class Product {
	
	@Id
	private int product_id;
	
	@Column
	private String product_name;
	
	@Column
	private String product_price;

	public Product(int product_id, String product_name, String product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
	}

	public Product() {
		super();
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_price() {
		return product_price;
	}

	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}
	

}
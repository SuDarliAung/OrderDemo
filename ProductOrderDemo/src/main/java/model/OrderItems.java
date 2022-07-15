package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderitems")
public class OrderItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int itemId = 0;
	@Column(name = "quantity")
	int quantity = 0;
	@Column(name = "total")
	double total = 0.0;
	@Column(name = "orderid")
	int orderid = 0;
	@Column(name = "productid")
	int productid = 0;
	
	Order orderObj = new Order();
	Product productObj = new Product();
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public Order getOrderObj() {
		return orderObj;
	}
	public void setOrderObj(Order orderObj) {
		this.orderObj = orderObj;
	}
	public Product getProductObj() {
		return productObj;
	}
	public void setProductObj(Product productObj) {
		this.productObj = productObj;
	}
}

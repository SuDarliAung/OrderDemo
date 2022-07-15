package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int orderid = 0;
	@Column(name = "orderno")
	long orderno = 0;
	@Column(name = "order_date")
	Date order_date = new Date();
	@Column(name = "status")
	String status = "";
	@Column(name = "customerID")
	String customerID = "";
	Customer cusObj = new Customer();
	
	public int getOrderId() {
		return orderid;
	}
	public long getOrderno() {
		return orderno;
	}
	public void setOrderno(long orderno) {
		this.orderno = orderno;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public Customer getCusObj() {
		return cusObj;
	}
	public void setCusObj(Customer cusObj) {
		this.cusObj = cusObj;
	}
}

package com.address.entity;

public class Address {

	private Long pincode;
	private String plot_no;
	private String street;
	private String landmark;
	private Long userId;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(Long pincode, String plot_no, String street, String landmark, Long userId) {
		this.pincode = pincode;
		this.plot_no = plot_no;
		this.street = street;
		this.landmark = landmark;
		this.userId = userId;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public String getPlot_no() {
		return plot_no;
	}
	public void setPlot_no(String plot_no) {
		this.plot_no = plot_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
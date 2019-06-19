package io.sample.entity;

public class Address {
	private Integer addressId;	
	private String addressLine1;
	private String city;
	private String countryCode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(Integer addressId, String addressLine1, String city, String countryCode) {
		this.setAddressId(addressId);
		this.addressLine1 = addressLine1;
		this.city = city;
		this.countryCode = countryCode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	

}

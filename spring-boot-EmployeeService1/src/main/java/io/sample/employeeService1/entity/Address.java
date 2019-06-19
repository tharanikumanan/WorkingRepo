package io.sample.employeeService1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address {
	
	@Id
	@Column(name = "ADDRESS_ID")
	private Integer addressId;	
	@Column(name = "ADDRESS_LINE1")
	private String addressLine1;
	@Column(name = "CITY")
	private String city;
	@Column(name = "COUNTRY_CODE")
	private String countryCode;
	

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(Integer addressId, String addressLine1, String city, String countryCode) {
		this.addressId = addressId;
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
	
	

}

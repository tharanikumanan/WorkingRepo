package com.gap.gsonmodels;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;

public class Car {
	@Expose
	@SerializedName("Name")
	@Since(1.9)
	private String carName;
	@Expose(deserialize=false)
	@SerializedName("Model")
	@Until(1.8)
	private String carModel;
	@Expose(serialize=false,deserialize=false)
	private String carMakingYear;
	@Expose
	@Until(2.1)
	private List<String> colors;
	@Expose
	@Since(1.9)
	private Double cost;
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarMakingYear() {
		return carMakingYear;
	}
	public void setCarMakingYear(String carMakingYear) {
		this.carMakingYear = carMakingYear;
	}
	public List<String> getColors() {
		return colors;
	}
	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carModel=" + carModel + ", carMakingYear=" + carMakingYear + ", colors="
				+ colors + ", cost=" + cost + "]";
	}
	
	

}

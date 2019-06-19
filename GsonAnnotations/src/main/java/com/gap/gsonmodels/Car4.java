package com.gap.gsonmodels;

import java.util.List;


import com.gap.gsonjson.typeadaptors.CustomVatAdaptors;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@JsonAdapter(CustomVatAdaptors.class)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car4 {

	@SerializedName("Name")
	private String carName;
	@SerializedName("Model")
	private String carModel;
	@SerializedName("MakingYear")
	private String carMakingYear;

	private List<String> colors;
	
	private Double cost;

	
	
	

	
	


}

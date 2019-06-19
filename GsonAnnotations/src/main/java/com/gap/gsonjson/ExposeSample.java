package com.gap.gsonjson;

import java.util.Arrays;

import com.gap.gsonmodels.Car;
import com.gap.gsonmodels.Car4;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExposeSample {
	
	public static void main(String[] args)
	{
		Car4 car = new Car4();
		car=Car4.builder().carName("swift").carModel("2016").carMakingYear("2018").colors(Arrays.asList("Red","White","Grey")).cost(200000.234).build();
		
		
		
		
		//Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setVersion(2.1).create();
		Gson gson =new GsonBuilder().create();
		//serilize
		String serliziedjson=gson.toJson(car);
		System.out.println("Serlizied"+serliziedjson);
		
		//deserlize
		 String inputJson  = "{\"Name\":\"AUDI\",\"Model\":2014,\"MakingYear\":\"2016\",\"cost\":2000.13,\"colors\":[\"GRAY\",\"BLACK\",\"WHITE\"]}";
	        car = gson.fromJson(inputJson, Car4.class);
	        System.out.println("Deserialized Car : "+ car);
	 
	 }
	

	}



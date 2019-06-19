package com.gap.gsonjson.typeadaptors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.gap.gsonmodels.Car;
import com.gap.gsonmodels.Car4;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class CustomVatAdaptors extends TypeAdapter<Car4> {

	@Override
	public void write(JsonWriter out, Car4 car) throws IOException {
		
		out.beginObject();
		out.name("Name").value(car.getCarName());
		out.name("Model").value(car.getCarModel());
		out.name("MakingYear").value(car.getCarModel());
		double costIncludingVAT = car.getCost()+ 0.21 * car.getCost();// Add 21% VAT
		
        out.name("cost").value(costIncludingVAT);
		out.name("colors");
		out.beginArray();
		for(String color : car.getColors())
		{
			out.value(color);
		}
		out.endArray();
		out.endObject();
		out.close();
		
		
	}

	@Override
	public Car4 read(JsonReader in) throws IOException {
		Car4 car=new Car4();
		in.beginObject();
		if(in.hasNext())
		{
			String name =in.nextName();
		  if(name.equalsIgnoreCase("Name"))
			  car.setCarName(in.nextString());
		  else if(name.equalsIgnoreCase("Model"))
			  car.setCarModel(in.nextString());
		  else if(name.equalsIgnoreCase("MakingYear"))
			  car.setCarMakingYear(in.nextString());
		  else if(name.equalsIgnoreCase("cost")) {
			   double costExcludingVat = in.nextDouble()/1.21;
			  
			  car.setCost(costExcludingVat);
		  }
		  else  if(name.equalsIgnoreCase("colors") && in.peek()!=JsonToken.NULL)
		  
			  car.setColors(readerStringArray(in));
		  else 
              in.skipValue();
          
		}
		in.endObject();
		return car;
	}
	
	private List<String> readerStringArray(JsonReader reader) throws IOException{
		List<String> colors =new ArrayList<String>();
		reader.beginArray();
		if(reader.hasNext())
			{
			colors.add(reader.nextString());
			}
		reader.endArray();	
		
		return colors;
		
	}

}

package com.gap.springconverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.ConverterRegistry;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.gap.springconverter.converters.LocalDateConerter;
import com.gap.springconverter.converters.LocalDateTimeConverter;

@SpringBootApplication
//@Configuration
public class SpringBootSpringconvertersApplication {
//implements WebMvcConfigurer 
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpringconvertersApplication.class, args);
	}

//	@Override
//	public void addConver(ConverterRegistry registry) {
//		registry.addConverter( new LocalDateConerter());
//		registry.addConverter(new LocalDateTimeConverter());
//	}

//	@Configuration
//	static class MyConfig implements WebMvcConfigurer {
//		@Override
//		public void addFormatters(FormatterRegistry registry) {
//			registry.addConverter(new LocalDateConerter());
//			registry.addConverter(new LocalDateTimeConverter());
//		}
//	}

}

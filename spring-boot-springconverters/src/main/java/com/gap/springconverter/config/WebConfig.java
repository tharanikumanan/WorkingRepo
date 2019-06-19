package com.gap.springconverter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.gap.springconverter.converters.LocalDateConerter;
import com.gap.springconverter.converters.LocalDateTimeConverter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new LocalDateConerter());

		registry.addConverter(new LocalDateTimeConverter());
	}
}

package com.gap.springconverter.converters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.core.convert.converter.Converter;

public class LocalDateConerter implements Converter<String, LocalDate> {

	@Override
	public LocalDate convert(String source) {
		if (Optional.ofNullable(source).isPresent())
			return LocalDate.parse(source, DateTimeFormatter.ISO_DATE);
		else
			return null;
	}

}

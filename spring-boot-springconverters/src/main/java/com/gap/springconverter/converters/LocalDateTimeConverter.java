package com.gap.springconverter.converters;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.core.convert.converter.Converter;

public class LocalDateTimeConverter implements Converter<String, LocalDateTime> {

	@Override
	public LocalDateTime convert(String source) {
		if (Optional.ofNullable(source).isPresent())
			return LocalDateTime.parse(source, DateTimeFormatter.ISO_DATE_TIME);
		return null;
	}

}

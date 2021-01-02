package com.anilpatro044.propertyRead;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyReader {
	
	@Value("${dev.url.service}")
	private String propertyUrl;

	public String getPropertyUrl() {
		
		return propertyUrl;
		
	}
	
	

}

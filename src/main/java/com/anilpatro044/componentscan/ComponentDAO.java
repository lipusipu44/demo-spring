package com.anilpatro044.componentscan;

import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
	
	private CompnentJdbcDAO compnentJdbcDAO;

	public CompnentJdbcDAO getCompnentJdbcDAO() {
		
		return compnentJdbcDAO;
		
	}

	public void setCompnentJdbcDAO(CompnentJdbcDAO compnentJdbcDAO) {
		
		this.compnentJdbcDAO = compnentJdbcDAO;
		
	}
	
	

}

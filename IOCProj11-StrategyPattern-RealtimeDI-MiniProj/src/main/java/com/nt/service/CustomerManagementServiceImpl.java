package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerManagementServiceImpl implements ICustomerMgmtService {
	//HAS-A property
	private  ICustomerDAO dao;
	


	public CustomerManagementServiceImpl(ICustomerDAO dao) {
		System.out.println("customer managementserviceimpl::1-param constructor");
		this.dao = dao;
	}



	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
		System.out.println("customermanagement serviceimpl.registercustomer()");
		//write b.logic to calculate intrest amount
		double intramt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0;
		
		//prepare customerBO class obj having persistable data
		CustomerBO custBO=new CustomerBO();
		custBO.setCname(dto.getCname());
		custBO.setCadd(dto.getCadd());
		custBO.setPamt(dto.getPamt());
		custBO.setIntramt(intramt);
		
		//use DAO
		int count=dao.insert(custBO);
		return null;
	}

}

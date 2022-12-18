package com.spring.oneToOneMapping2.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.oneToOneMapping2.Service.CustomerDetailService;
//import com.spring.oneToOneMapping2.Service.CustomerDetailService;
import com.spring.oneToOneMapping2.model.CustomerDetail;
import com.spring.oneToOneMapping2.repository.CustomerRepositoy;

@Service
public class CustomerDetailServiceImpl implements CustomerDetailService {
	
	@Autowired
	CustomerRepositoy customerrepo;

	@Override
	public List<CustomerDetail> getall() {
		
		return customerrepo.findAll();
	} 



}

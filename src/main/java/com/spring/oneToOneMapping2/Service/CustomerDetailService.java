package com.spring.oneToOneMapping2.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.oneToOneMapping2.model.CustomerDetail;

@Service
public interface CustomerDetailService {

	List<CustomerDetail> getall();
	
}

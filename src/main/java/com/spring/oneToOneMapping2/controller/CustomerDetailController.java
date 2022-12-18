package com.spring.oneToOneMapping2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.oneToOneMapping2.Service.CustomerDetailService;
import com.spring.oneToOneMapping2.api.User;
//import com.spring.oneToOneMapping2.Service.CustomerDetailService;
import com.spring.oneToOneMapping2.model.CustomerDetail;
import com.spring.oneToOneMapping2.repository.CustomerRepositoy;
import com.spring.oneToOneMapping2.spec.CustomerSpec;

//@Controller
//@RequestMapping("/search/")

//@RequestMapping("/home")

@RestController
public class CustomerDetailController {

	@Autowired
	CustomerSpec customerSpec;
//
	@Autowired
	CustomerRepositoy customerRepositoy;

	@Autowired
	CustomerDetailService customerDetailService;

//	@GetMapping("/list")
//	public List<CustomerDetail> list(@RequestParam(value="file_no",required = false) String file_no,
//	@RequestParam(value="applicant_name",required = false) String applicant_name,
//	@RequestParam(value="Cus_id_no",required = false) String Cus_id_no,
//	@RequestParam(value="mobile_num",required = false)String mobile_num,
//    @RequestParam(value="reason",required = false) String reason
//) 
//	
//	{
//	
//		Specification<CustomerDetail> specification= CustomerSpec.getCustomerSpec(file_no, applicant_name, Cus_id_no, mobile_num, reason);
//		
//		return customerRepositoy.findAll(specification);
//
//	}

	@GetMapping("/list")
	public List<CustomerDetail> list(User userReq)

	{
		Specification<CustomerDetail> specification = CustomerSpec.getCustomerSpec(userReq.getFile_no(),
				userReq.getApplicant_name(), userReq.getCus_id_no(), userReq.getMobile_num(), userReq.getReason());

		return customerRepositoy.findAll(specification);

	}

	@PostMapping("/getFilteredEmployeeList")
	public List<CustomerDetail> sayHi() {

		return customerDetailService.getall();

	}

//	@GetMapping("list")
//	public String list() {
//
// 		return "Hello";
//
//	}

//	@PostMapping("/hello")
//	public String sayHi() {
//
//		return "Hello frnds";
//
//	}

}

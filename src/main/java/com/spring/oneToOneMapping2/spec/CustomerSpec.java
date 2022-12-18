package com.spring.oneToOneMapping2.spec;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;

import com.spring.oneToOneMapping2.model.CustomerDetail;


//@Component
//public class CustomerSpec {
//
//	public static Specification<CustomerDetail> getCustomerSpec(String file_no, String applicant_name,
//			String Cus_id_no, String mobile_num, String reason) {
//
//		return ((root, query, creteriaBuilder) -> {
//
//			List<Predicate> predicate = new ArrayList<>();
//
//			if (file_no != null && !(file_no.isEmpty())) {
//				predicate.add(creteriaBuilder.like(root.get("file_no"),"%" +file_no+"%"));
//			}
//				if (applicant_name != null && !(applicant_name.isEmpty())) {
//					predicate.add(creteriaBuilder.like(root.get("applicant_name"),"%" + applicant_name+"%"));
//			}
//			if (Cus_id_no != null && !(Cus_id_no.isEmpty())) {
//				predicate.add(creteriaBuilder.like(root.get("Cus_id_no"),"%" + Cus_id_no+"%"));
//			}
//			if (mobile_num != null && !(mobile_num.isEmpty())) {
//				predicate.add(creteriaBuilder.like(root.get("mobile_num"),"%" + mobile_num+"%"));
//			}
//			if (reason != null && !(reason.isEmpty())) {
//				predicate.add(creteriaBuilder.like(root.get("reason"),"%" + reason+"%"));
//			}
//			
//			return creteriaBuilder.and(predicate.toArray(new Predicate[0]));
//			
//		});
//
//	}
//
//}

@Component
public class CustomerSpec {

	public static Specification<CustomerDetail> getCustomerSpec(String file_no, String applicant_name,
			String Cus_id_no, String mobile_num, String reason) {

		return ((root, query, creteriaBuilder) -> {

			List<Predicate> predicate = new ArrayList<>();

			if (file_no != null && !(file_no.isEmpty())) {
				predicate.add(creteriaBuilder.like(root.get("file_no"),"%" +file_no+"%"));
			}
				if (applicant_name != null && !(applicant_name.isEmpty())) {
					predicate.add(creteriaBuilder.like(root.get("applicant_name"),"%" + applicant_name+"%"));
			}
			if (Cus_id_no != null && !(Cus_id_no.isEmpty())) {
				predicate.add(creteriaBuilder.like(root.get("Cus_id_no"),"%" + Cus_id_no+"%"));
			}
			if (mobile_num != null && !(mobile_num.isEmpty())) {
				predicate.add(creteriaBuilder.like(root.get("mobile_num"),"%" + mobile_num+"%"));
			}
			if (reason != null && !(reason.isEmpty())) {
				predicate.add(creteriaBuilder.like(root.get("reason"),"%" + reason+"%"));
			}
			
			return creteriaBuilder.and(predicate.toArray(new Predicate[0]));
			
		});

	}

}




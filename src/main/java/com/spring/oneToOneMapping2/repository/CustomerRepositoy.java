package com.spring.oneToOneMapping2.repository;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.oneToOneMapping2.model.CustomerDetail;
@Repository
public interface CustomerRepositoy extends JpaRepository<CustomerDetail, Integer> {

	List<CustomerDetail> findAll(Specification<CustomerDetail> specification);

}

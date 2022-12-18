package com.spring.oneToOneMapping2.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	
	public CustomerDetail() {
		super();
	}
	private String file_no;
	private String applicant_name;
	private String Cus_id_no;
	private String mobile_num;
	private String reason;
	private LocalDate created_on;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFile_no() {
		return file_no;
	}
	public void setFile_no(String file_no) {
		this.file_no = file_no;
	}
	public String getApplicant_name() {
		return applicant_name;
	}
	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}
	public String getCus_id_no() {
		return Cus_id_no;
	}
	public void setCus_id_no(String cus_id_no) {
		Cus_id_no = cus_id_no;
	}
	public String getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public LocalDate getCreated_on() {
		return created_on;
	}
	public void setCreated_on(LocalDate created_on) {
		this.created_on = created_on;
	}

	public CustomerDetail(int id, String file_no, String applicant_name, String cus_id_no, String mobile_num,
			String reason, LocalDate created_on) {
		super();
		this.id = id;
		this.file_no = file_no;
		this.applicant_name = applicant_name;
		Cus_id_no = cus_id_no;
		this.mobile_num = mobile_num;
		this.reason = reason;
		this.created_on = created_on;
	}

}

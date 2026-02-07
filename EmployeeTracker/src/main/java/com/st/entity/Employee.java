package com.st.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name="Employee")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empno;
	
	@Column(length=20)
	private String ename;
	
	@Column(length=20)
	private String job;
	
//	@Transient this annotation is used for the field that we don't want to be persisted in dbtable and whose value we don't want to show to client
	private Double salary;
	
	private Integer deptno;
	
}

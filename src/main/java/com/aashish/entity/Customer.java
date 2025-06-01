package com.aashish.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Table(name="Appointment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class Customer {
	@Column(name="CID")
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(name="gen1",sequenceName = "SID_SEQ1",initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer cid;
	
	@Column(name="CNAME",length = 30)
	@NonNull
	private   String  cname;
	
	
	@Column(name="ADDRS",length = 30)
	@NonNull
	private   String  addrs;
	
	@Column(name="CONTACT_NO")
	@NonNull
	private   Long  contactNo;
	
	@Column(name="EMAIL_ID")
	@NonNull
	private String mailId;
}

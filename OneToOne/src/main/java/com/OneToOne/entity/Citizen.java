package com.OneToOne.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Citizen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	@Column (length = 20, nullable =false)
	private String cname;
	@Column(length = 20, nullable =false)
	private String surname;
	@Column(length = 11, nullable=false)
	private long phone;
	@Column (length = 30, nullable = false)
	private String email;
	@Column(length = 20, nullable = false)
	private String dob;
	
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	public long getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@OneToOne(targetEntity= Address.class, cascade= CascadeType.ALL)
	private Address address;   //aggregation
}

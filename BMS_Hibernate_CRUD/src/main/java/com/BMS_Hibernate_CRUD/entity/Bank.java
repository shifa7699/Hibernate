package com.BMS_Hibernate_CRUD.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Bank_Information")
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id1;
	@Column (length =11,nullable =false)
	private String holderName1;
	@Column (length =15,nullable =false)
	private int acc_no1;
	@Column(length =20,nullable =false)
	private String IFSC1;
	@Column(length =10,nullable =false)
	private int Balance1;
	@Column(length =11,nullable =false)
	private long pin1;
	public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public String getHolderName1() {
		return holderName1;
	}
	public void setHolderName1(String holderName1) {
		this.holderName1 = holderName1;
	}
	public int getAcc_no1() {
		return acc_no1;
	}
	public void setAcc_no1(int acc_no1) {
		this.acc_no1 = acc_no1;
	}
	public String getIFSC1() {
		return IFSC1;
	}
	public void setIFSC1(String iFSC1) {
		IFSC1 = iFSC1;
	}
	public int getBalance1() {
		return Balance1;
	}
	public void setBalance1(int balance1) {
		Balance1 = balance1;
	}
	public long getPin1() {
		return pin1;
	}
	public void setPin1(long pin1) {
		this.pin1 = pin1;
	}
}
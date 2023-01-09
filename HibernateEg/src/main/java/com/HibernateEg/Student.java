package com.HibernateEg;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//@Entity - This annotation specifies that the class is an entity.
//@Table - This annotation specifies the table in the database with which this entity
//@Id - This annotation specifies the primary key of the entity

@Entity //marking this class as entity
//specifies the table name where data of this entity is to be persisted.
@Table(name="Student_info")
public class Student 
{
	@Id //Marks identifier of class
	private int StuId;
	private String StuFirstName, StuLastName, StuEmail, StuAddr;
	private double StuFee;
	private long StuPhone;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [StuId=" + StuId + ", StuFirstName=" + StuFirstName + ", StuLastName=" + StuLastName
				+ ", StuEmail=" + StuEmail + ", StuAddr=" + StuAddr + ", StuFee=" + StuFee + ", StuPhone=" + StuPhone
				+ "]";
	}
	public Student(int stuId, String stuFirstName, String stuLastName, String stuEmail, String stuAddr, double stuFee,
			long stuPhone) {
		super();
		StuId = stuId;
		StuFirstName = stuFirstName;
		StuLastName = stuLastName;
		StuEmail = stuEmail;
		StuAddr = stuAddr;
		StuFee = stuFee;
		StuPhone = stuPhone;
	}
	public int getStuId() {
		return StuId;
	}
	public void setStuId(int stuId) {
		StuId = stuId;
	}
	public String getStuFirstName() {
		return StuFirstName;
	}
	public void setStuFirstName(String stuFirstName) {
		StuFirstName = stuFirstName;
	}
	public String getStuLastName() {
		return StuLastName;
	}
	public void setStuLastName(String stuLastName) {
		StuLastName = stuLastName;
	}
	public String getStuEmail() {
		return StuEmail;
	}
	public void setStuEmail(String stuEmail) {
		StuEmail = stuEmail;
	}
	public String getStuAddr() {
		return StuAddr;
	}
	public void setStuAddr(String stuAddr) {
		StuAddr = stuAddr;
	}
	public double getStuFee() {
		return StuFee;
	}
	public void setStuFee(double stuFee) {
		StuFee = stuFee;
	}
	public long getStuPhone() {
		return StuPhone;
	}
	public void setStuPhone(long stuPhone) {
		StuPhone = stuPhone;
	}
	
}

package com.HibernateCRUD.entity;

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
	@Table(name = "Student_details")
	public class Student {
		@Id
		@GeneratedValue(strategy =GenerationType.AUTO)
		private int id;
		@Column(length = 20, nullable = false)
		private String Name;
		@Column(length = 11, nullable = false)
		private long Phone;
		@Column(length = 20, nullable = false)
		private String Dept;
		@Column(length = 20, nullable = false)
		private String email;
		/*public void setPhone(long p) {
			p=Phone;
			}
		public void setemail(String e) {
			e=email;			
		}
		public void setDept(String d) {
			d=Dept;			
		}
		public void setName(String n) {
			n=Name;			
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return Name;
		}
		public String getDept() {
			return Dept;
		}
		public String getemail() {
			return email;
		}
		public long getPhone() {
			return Phone;*/
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public long getPhone() {
			return Phone;
		}
		public void setPhone(long phone) {
			Phone = phone;
		}
		public String getDept() {
			return Dept;
		}
		public void setDept(String dept) {
			Dept = dept;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		}



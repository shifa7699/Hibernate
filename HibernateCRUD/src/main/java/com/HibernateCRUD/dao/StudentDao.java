package com.HibernateCRUD.dao;

public interface StudentDao {
	public void addStudent(); // Add student in DB
	public void updateStudent(); // update existing data from DB
	public void deleteStudent(); //delete existing data from DB
	public void fetchstudent();  // fetch data from DB
}

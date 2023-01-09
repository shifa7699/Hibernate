package com.HibernateCRUD.Daolmpl;

import java.util.Scanner;

import javax.persistence.criteria.Selection;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HibernateCRUD.config.HibernateUtil;
import com.HibernateCRUD.dao.StudentDao;
import com.HibernateCRUD.entity.Student;

public class StudentDaolmpl implements StudentDao{
public void addStudent() {
	Scanner sc=new Scanner(System.in);
	String n,d,e;
	long p;
	System.out.println("Enter name: ");
	n=sc.nextLine();
	System.out.println("Enter Dept: ");
	d=sc.nextLine();
	System.out.println("Enter email: ");
	e=sc.nextLine();
	System.out.println("Enter phone: ");
	p=sc.nextLong();
	Student s=new Student();
	s.setName(n);
	s.setDept(d);
	s.setEmail(e);
	s.setPhone(p);
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	session.save(s);
	t.commit();}
	public void updateStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id=sc.nextInt();
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		Student std=session.get(Student.class, id);
		System.out.println("Enter phone number: ");
		long phone=sc.nextLong();
		std.setPhone(phone);
		session.update(std);
		System.err.println("Updated successfully...");
		t.commit();}
		
		public void deleteStudent() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ID: ");
			int id=sc.nextInt();
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			Student std1=session.get(Student.class, id);
			session.delete(std1);
			System.err.println("deleted successfully...");
			t.commit();
		}
			public void fetchstudent() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter ID: ");
				int id=sc.nextInt();
				Session session=HibernateUtil.getSessionFactory().openSession();
				Transaction t=session.beginTransaction();
				Student s1=session.get(Student.class, id);
				
				System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getDept()+" "+s1.getEmail()+" "+s1.getPhone());
				t.commit();
}
}
package com.BMS_Hibernate_CRUD.DaoImpl;

import java.sql.ResultSet;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.BMS_Hibernate_CRUD.Dao.Dao;
import com.BMS_Hibernate_CRUD.congif.HibernateUtil;
import com.BMS_Hibernate_CRUD.entity.Bank;

public class DaoImpl implements Dao  {

public void openAcc() {
	 Scanner sc=new Scanner(System.in);
		String n,t,d; 
		int b,no;
		long p;
		System.out.println("Enter Account number : ");
		no=sc.nextInt();
		System.out.println("Enter Account Holder name : ");
		n=sc.nextLine();
		System.out.println("Enter Account Type : ");
		t=sc.nextLine();
		System.out.println("Enter IFSC code: ");
		d=sc.nextLine();
		System.out.println("Enter Balance: ");
		b=sc.nextInt();
		System.out.println("Enter pin: ");
		p=sc.nextLong();
		Bank ac = new Bank();
		ac.setAcc_no1(no);
		ac.setHolderName1("Shifa Iqbal");
		ac.setIFSC1("F8736");
		ac.setBalance1(5000);
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t1=session.beginTransaction();
		session.save(ac);
		t1.commit();}
public void showAcc() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Account number : ");
	int acc_no=sc.nextInt();
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	Bank b1=session.get(Bank.class, acc_no);

	System.out.println(b1.getId1()+" "+b1.getHolderName1()+" "+b1.getIFSC1()+" "+b1.getBalance1()+" "+b1.getPin1());
	t.commit();
 }
public void changepin() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name: ");
	String name=sc.next();
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	Bank b=session.get(Bank.class, name);
	System.out.println("Enter phone number: ");
	long p=sc.nextLong();
	b.setPin1(p);
	session.update(b);
	System.out.println("Updated successfully...");
	t.commit();}
public void closeAccount() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Account Number : ");
	int acc_no1=sc.nextInt();
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	Bank b2=session.get(Bank.class, acc_no1);
	session.delete(b2);
	System.out.println("deleted successfully...");
	t.commit();
}
public void depositBal() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Account number : ");
	int acc_no=sc.nextInt();
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	Bank b3=session.get(Bank.class, acc_no);
	System.out.println("Enter the amount you need to deposit : ");
	int d=sc.nextInt();
	b3.setBalance1(d);
	session.saveOrUpdate(b3.getBalance1());
	System.out.println("Deposited successfully...");
	t.commit();
}
public void withdrawBal() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Account number : ");
	int acc_no=sc.nextInt();
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	Bank b4=session.get(Bank.class, acc_no);
	System.out.println("Enter the amount you need to withdraw : ");
	int d1=sc.nextInt();
	b4.setBalance1(d1);
	session.saveOrUpdate(b4.getBalance1());
	System.out.println("Withdrawn successfully...");
	t.commit();
}	
}
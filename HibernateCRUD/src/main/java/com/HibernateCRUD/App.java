package com.HibernateCRUD;

import java.util.Scanner;

import com.HibernateCRUD.Daolmpl.StudentDaolmpl;


public class App 
{
    public static void main( String[] args )
    {
        StudentDaolmpl dao =new StudentDaolmpl();
        char c;
        do {
        	Scanner sc= new Scanner(System.in);
        	System.out.println("PRESS 1 for add student \n PRESS 2 for display student \n PRESS 3 for Update student \n PRESS 4 for Delete student \n PRESS 5 for Fetch student");
        	int a= sc.nextInt();
        	switch(a)  {
        	case 1 :
        		dao.addStudent();
        		break;
        	case 2 : 
        		dao.fetchstudent();
        		break;
        	case 3 :
        		dao.updateStudent();
        		break;
        	case 4 : 
        		dao.deleteStudent();
        		break;
        	case 5 :
        		System.exit(0);
        		break;
        		default :
        			System.out.println("INVALID CHOICE");
        	}
        	System.out.println("Do you Want to Continue ? Y/N");
        	c = sc.next().charAt(0);
           } while (c=='y' || c== 'Y');
        System.out.println("Thank You");
    }
}

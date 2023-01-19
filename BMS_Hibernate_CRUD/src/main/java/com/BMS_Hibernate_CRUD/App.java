package com.BMS_Hibernate_CRUD;

import java.util.Scanner;

import com.BMS_Hibernate_CRUD.DaoImpl.DaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	DaoImpl dao = new DaoImpl();
    	char c;
        do {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Press 1 for open account \n Press 2 for display account details \n"
        			+"Press 3 for update pin number \n Press 4 for deposit amount in  account \n Press 5 to delete account\n Press 6 for exit");
        	int a=sc.nextInt();
        	switch(a) {
        	case 1:dao.openAcc();
        	break;
        	case 2:dao.showAcc();
        	break;
        	case 3:dao.changepin();
        	break;
        	case 4:dao.depositBal();
        	break;
        	case 5:dao.closeAccount();
        	break;
        	case 6:System.exit(0);
        	break;
        	default:System.out.println("Invalid choice!");
        	}
        	System.out.println("Do you want to continue? Y/N");
        	c=sc.next().charAt(0);
        }while(c=='y'||c=='Y');
        System.out.println("Thank you");
        }
    }


package com.InheritanceMultipleTable;

import com.InheritanceMultipleTable.DaoImpl.DaoImpl;

public class App 
{
    public static void main( String[] args )
    {
      DaoImpl dao = new DaoImpl();
      dao.addVehicle();
    }
}

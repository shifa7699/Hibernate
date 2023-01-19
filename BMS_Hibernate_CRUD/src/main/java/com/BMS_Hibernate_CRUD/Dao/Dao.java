package com.BMS_Hibernate_CRUD.Dao;

import java.sql.SQLException;

public interface Dao {
	void openAcc();
	void showAcc() throws SQLException;
	void depositBal();
	void withdrawBal();
	void changepin();
}

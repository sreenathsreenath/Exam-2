package com.java.infinite.leavejdbc;

import java.sql.SQLException;

public class LeaveShowMain {
public static void main(String[] args)  {
	
	LeaveDAO dao= new LeaveDAO();
	Leave[] leaveList; 
	try {
		leaveList= dao.ShowLeave();
		for (Leave l : leaveList) { 
			System.out.println(l);
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

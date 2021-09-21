package com.java.infinite.leavejdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class LeaveSearchMain { 
		
		public static void main(String[] args) {
			int EMP_ID;
			System.out.println("enter EMP ID");
			Scanner sc= new Scanner(System.in);
			EMP_ID = sc.nextInt();
		     LeaveDAO dao= new LeaveDAO();
		    
				Leave leave;
				try {
					leave = dao.searchLeave(EMP_ID);
					if(leave!=null) {
						System.out.println(leave);	
				}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

	}

}

package com.SpringJDBC.service;

import java.util.Scanner;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringJDBC.dao.EmployeeDAO;

public class CreateEmployee {

	static Scanner in = null;

	public static boolean saveEmployee() {
		JdbcTemplate conn = EmployeeDAO.getConnection();
		in = new Scanner(System.in);

		if (conn != null) {
			try {
				System.out.println("success :-)");

				// SQL INSERT Operation
				String sqlInsertQuery = "INSERT INTO Employee (name, email, address, phoneNum) VALUES (?, ?, ?, ?)";
				for (int i = 1; i < 3; i++) {
					
					System.out.println("Employee " + i);
					
					System.out.print("name : ");
					String name = in.nextLine();
					System.out.print("\nemail: ");
					String email = in.next();
					System.out.print("\naddress : ");
					String address = in.next();
					System.out.print("\nphone no : ");
					String phone = in.next();
					conn.update(sqlInsertQuery, name, email, address, phone);
					in.nextLine();

				}

				System.out.println("Saved");
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return true;
		} else {
			System.out.println("Please check your spring JDBCTemplate connection!");
		}
		return false;

	}
}

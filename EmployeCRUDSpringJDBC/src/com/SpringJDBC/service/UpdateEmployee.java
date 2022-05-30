package com.SpringJDBC.service;

import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringJDBC.dao.EmployeeDAO;

public class UpdateEmployee {

	public static boolean update() {
		JdbcTemplate conn = EmployeeDAO.getConnection();

		if (conn != null) {
			System.out.println("Success!");
			String sqlUpdateQuery = "Update Employee set email = '894807@gmail.com' where email like 'subho%'";
			conn.update(sqlUpdateQuery);
			System.out.println("Uddated!");
			return true;
		} else {
			System.out.println("Please check your spring jdbc connection.");
			return false;
		}

	}
}

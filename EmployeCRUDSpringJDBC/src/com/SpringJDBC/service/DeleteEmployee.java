package com.SpringJDBC.service;

import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringJDBC.dao.EmployeeDAO;

public class DeleteEmployee {

	public static boolean deleteEmployee() {
		JdbcTemplate conn = EmployeeDAO.getConnection();

		if (conn != null) {
			System.out.println("Success!");

			String sqlDeleteQuery = "delete from Employee where name = ? ";
			conn.update(sqlDeleteQuery, "Ram Mitra");
			System.out.println("Deleted!");
			return true;
		} else {
			System.out.println("Please check your spring jdbc connection.");
			return false;
		}
	}
}

package com.SpringJDBC.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.SpringJDBC.dao.EmployeeDAO;
import com.SpringJDBC.entity.Employee;

public class RetrieveEmployee {

	@SuppressWarnings("unchecked")
	public static List<Employee> getEmployees() {
		JdbcTemplate conn = EmployeeDAO.getConnection();

		if (conn != null) {
			System.out.println("Success :-)");

			String sqlSelectQuery = "Select * from Employee";
			List<Employee> employeeList = conn.query(sqlSelectQuery, new RowMapper() {

				public Employee mapRow(ResultSet result, int rowNum) {
					Employee emp = new Employee();

					try {
						emp.setName(result.getString("name"));
						emp.setEmail(result.getString("email"));
						emp.setAddress(result.getString("address"));
						emp.setPhoneNum(result.getString("phoneNum"));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return emp;
				}
			});

			return employeeList;
		} else {
			System.out.println("Please check your spring JDBCTemplate connection!");
			return null;
		}
	}
}

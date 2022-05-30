package com.SpringJDBC.dao;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class EmployeeDAO {

	private static JdbcTemplate jdbcTempleteObj = null;
	private static SimpleDriverDataSource simpleDriverDataSourceObj = null;

	// DB configuration :

	private static final String URL = "jdbc:mysql://localhost:3306/spring-jdbc";
	private static final String USER = "root";
	private static final String PASSWORD = "sayan";

	private static SimpleDriverDataSource getDataSource() {
		try {
			simpleDriverDataSourceObj = new SimpleDriverDataSource();
			simpleDriverDataSourceObj.setDriver(new com.mysql.cj.jdbc.Driver());
			simpleDriverDataSourceObj.setUrl(URL);
			simpleDriverDataSourceObj.setUsername(USER);
			simpleDriverDataSourceObj.setPassword(PASSWORD);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return simpleDriverDataSourceObj;
	}

	public static JdbcTemplate getConnection() {
		return new JdbcTemplate(getDataSource());
	}
}

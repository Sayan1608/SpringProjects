package com.SpringJDBC.driver;

import java.util.List;

import com.SpringJDBC.entity.Employee;
import com.SpringJDBC.service.CreateEmployee;
import com.SpringJDBC.service.DeleteEmployee;
import com.SpringJDBC.service.RetrieveEmployee;

public class Main {
	public static void main(String[] args) {

//		CreateEmployee.saveEmployee();
//		getEmployees();
//		UpdateEmployee.update();
		
		DeleteEmployee.deleteEmployee();

	}

	public static void getEmployees() {
		if(RetrieveEmployee.getEmployees()!= null) {
			List<Employee> empList = RetrieveEmployee.getEmployees();
			
			for(Employee emp : empList) {
				System.out.println(emp);
				System.out.println("-----------------------");
			}
		}else {
			System.out.println("empty list!");
		}
	}
}

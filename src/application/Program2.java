package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.creaDepartmentDao();
		System.out.println("=== TEST 1: seller findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("=== TEST 2: seller findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}

	}

}

package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.creaDepartmentDao();
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("=== TEST 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		/*
		System.out.println("=== TEST 2: department insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());
		*/
		System.out.println("=== TEST 2: department Update ===");
		department = departmentDao.findById(1);
		department.setName("Sport");
		departmentDao.Update(department);
		System.out.println("Update completed");
	}

}

package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao  = DaoFactory.createDepartmentDao();
		
		System.out.println("===== test 1: findById ======");
		Department department = depDao.findById(3);
		System.out.println(department);
		
		System.out.println("========teste 2: findall======");
		List<Department>list = depDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		/*System.out.println("=========== test 3: insert");
		Department newDep = new Department(null, "Music");
		depDao.insert(newDep);
		System.out.println("insert! New id: " + newDep.getId()); */
		
		/*department = depDao.findById(1);
		department.setName("computer");
		depDao.update(department);
		System.out.println("Update completed ");
		*/
		System.out.println("enter id for delete:  ");
		int n = sc.nextInt();
		depDao.deletebyId(n);
		
	}

}

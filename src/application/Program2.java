package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] agrs) {
		
		DepartmentDao depDao  = DaoFactory.createDepartmentDao();
		
		Department department = depDao.findById(3);
		
		System.out.println(department);
		
		/*System.out.println("========teste 1 findall======");
		List<Department>list = dep.findAll();
		for (Department d : list) {
			System.out.println(d);
		}*/
	}

}

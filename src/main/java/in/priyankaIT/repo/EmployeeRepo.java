package in.priyankaIT.repo;

import org.springframework.data.repository.CrudRepository;

import in.priyankaIT.entity.Employee;
import java.util.List;


public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
	
	//select * from employee where emp_dept = :dept
	public List<Employee> findByEmpDept(String dept);
	
	//select * from employee where emp_gender = :gender
	
	public List<Employee> findByEmpGender(String gender);
	
	//select * from employee where emp_gender = :gender and emp_dept = :dept
	
	public List<Employee> findByEmpGenderAndEmpDept(String gender, String dept);
	
	//select * from employee where emp_salary >= :salary
	public List<Employee> findByEmpSalaryGreaterThanEqual(float salary);

}

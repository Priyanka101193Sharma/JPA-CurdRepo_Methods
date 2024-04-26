package in.priyankaIT.service;

import java.lang.StackWalker.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.priyankaIT.entity.Employee;
import in.priyankaIT.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	private EmployeeRepo empRepo;
	
	public EmployeeService(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
		System.out.println(this.empRepo.getClass().getName());
	}
	
	public void getEmp() {
		
		  Optional<Employee> findById =empRepo.findById(101);
		   if(findById.isPresent())
		  { Employee employee = findById.get(); 
		  System.out.println(employee);
		  }
	}
		 
	
	public void getEmps() {
		List<Integer> empIds = Arrays.asList(102,103);
		Iterable<Employee> itr = empRepo.findAllById(empIds);
		
		itr.forEach(System.out::println);
		
	}
	public void getAllEmps() {
		Iterable<Employee> findAll = empRepo.findAll();
		findAll.forEach(System.out::println);
	}
	public void getEmpByDept(String dept) {
		List<Employee> emps = empRepo.findByEmpDept(dept);
		emps.forEach(System.out::println);
	}
	
	public void getEmpByGender(String gender) {
		List<Employee> emps= empRepo.findByEmpGender(gender);
		emps.forEach(System.out::println);
	}
	
	public void getEmpByGenderAndDept(String gender, String dept) {
		List<Employee> emps =empRepo.findByEmpGenderAndEmpDept(gender, dept);
		emps.forEach(System.out::println);
		
	}
	
	public void getEmpBySalary(float salary) {
		List<Employee> emps = empRepo.findByEmpSalaryGreaterThanEqual(salary);
		emps.forEach(System.out::println);
		
	}
	
	
	
	
	
	
	public void saveEmployee() {
		
		Employee emp =new Employee();
			
		emp.setEmpId(101);
		emp.setEmpName("Joiye");
		emp.setEmpGender("Male");
		emp.setEmpDept("Sales");
		emp.setEmpSalary(18000.00);
	}

		
		public void saveMultipleEmployees() {
		
        Employee emp1 =new Employee();
		
		emp1.setEmpId(102);
		emp1.setEmpName("Jiye");
		emp1.setEmpGender("female");
		emp1.setEmpDept("Softwere Engineer");
		emp1.setEmpSalary(180000.00);
		
        Employee emp2 =new Employee();
		
		emp2.setEmpId(103);
		emp2.setEmpName("sudhir");
		emp2.setEmpGender("Male");
		emp2.setEmpDept("System Desiner");
		emp2.setEmpSalary(180000.00);
		
		List<Employee> empsList = Arrays.asList(emp1,emp2);
		empRepo.saveAll(empsList);
	}

}

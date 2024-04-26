package in.priyankaIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.priyankaIT.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeService service =context.getBean(EmployeeService.class);
		
		//service.saveEmployee();
		//service.saveMultipleEmployees();
		//service.getEmp();
		//service.getEmps();
		//service.getAllEmps();
		//service.getEmpByDept("Sales");
		//service.getEmpByGender("Male");
		//service.getEmpByGenderAndDept("female", "Softwere Engineer");
		service.getEmpBySalary(180000.00f);
	}

}

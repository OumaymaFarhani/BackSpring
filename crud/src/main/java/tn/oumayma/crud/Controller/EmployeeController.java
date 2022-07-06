package tn.oumayma.crud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.oumayma.crud.Entity.Employee;
import tn.oumayma.crud.Service.EmployeeService;

@RestController
@RequestMapping("/emloyees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	

}

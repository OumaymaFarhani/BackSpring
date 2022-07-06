package tn.oumayma.crud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.oumayma.crud.Entity.Employee;
import tn.oumayma.crud.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository e;
	
	public Employee save(Employee emp) {
		return e.save(emp);
		
	}

	public EmployeeRepository getE() {
		return e;
	}

	public void setE(EmployeeRepository e) {
		this.e = e;
	}

}

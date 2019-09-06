package ch.noseryoung.demo.Employee;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee findByName(String name) {
		return employeeRepository.findByName(name);
	}

}

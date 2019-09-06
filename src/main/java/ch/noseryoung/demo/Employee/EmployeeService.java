package ch.noseryoung.demo.Employee;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
	public Employee findByName(String name);
}

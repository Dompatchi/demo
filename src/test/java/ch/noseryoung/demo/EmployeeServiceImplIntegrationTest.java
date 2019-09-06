package ch.noseryoung.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;


import ch.noseryoung.demo.Employee.Employee;
import ch.noseryoung.demo.Employee.EmployeeRepository;
import ch.noseryoung.demo.Employee.EmployeeServiceImpl;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeServiceImplIntegrationTest {
 
	@InjectMocks
	   private EmployeeServiceImpl employeeService;
	
	   @Mock
	   private EmployeeRepository employeeRepository;
	   
	   @Before
	   public void setUp() {
	       Employee alex = new Employee();
	       alex.setName("alex");
	       Mockito.when(employeeRepository.findByName(alex.getName()))
	               .thenReturn(alex);
	   }
	   
	   @Test
	   public void whenValidName_thenEmployeeShouldBeFound() {
	       String name = "alex";
	       Employee found = employeeService.findByName(name);
	       assertThat(found.getName())
	               .isEqualTo(name);
	   }
}
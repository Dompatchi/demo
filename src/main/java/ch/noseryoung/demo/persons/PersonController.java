package ch.noseryoung.demo.persons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
	private PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}
	
	@GetMapping("/{id}")
	public @ResponseBody ResponseEntity<Person> getPerson(@PathVariable Long id) {
		Person person = personService.getPerson(id).get();
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}
	
	@GetMapping({"", "/"})
	public @ResponseBody ResponseEntity<List<Person>> getAllPersons() {
		List<Person> list = personService.getAllPersons();
		return new ResponseEntity<List<Person>>(list, HttpStatus.OK);
	}
	
	@PostMapping({"", "/"})
	public @ResponseBody ResponseEntity<String> createPerson(@RequestBody Person person) {
		personService.createPerson(person);
		return new ResponseEntity<String>("Person created", HttpStatus.CREATED);
	}
	
	@PutMapping({"", "/"})
	public @ResponseBody ResponseEntity<String> updatePerson(@RequestBody Person person) {
		personService.updatePerson(person);
		return new ResponseEntity<String>("Person updated", HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public @ResponseBody ResponseEntity<String> deletePerson(@PathVariable Long id) {
		personService.deletePerson(id);
		return new ResponseEntity<String>("Person deleted", HttpStatus.CREATED);
	}
}
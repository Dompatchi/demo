package ch.noseryoung.demo.persons;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	private PersonRepository personRepository;
	
	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public Optional<Person> getPerson(Long id) {
		return personRepository.findById(id);
	}

	public List<Person> getAllAbilities() {
		return personRepository.findAll();
	}

	public String createPerson(Person person) {
		personRepository.saveAndFlush(person);
		return "The person: " + person.getName() + " has been created.";
	}

	public String updatePerson(Person person) {
		personRepository.saveAndFlush(person);
		return "The person: " + person.getName() + " has been updated." ;
	}

	public String deletePerson(Long id) {
		personRepository.deleteById(id);
		return "The person with the ID: " + id + " has been deleted.";
	}

}

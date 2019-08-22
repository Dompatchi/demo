package ch.noseryoung.demo.abilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbilityService {
	
	private AbilityRepository abilityRepository;
	
	@Autowired
	public AbilityService(AbilityRepository abilityRepository) {
		this.abilityRepository = abilityRepository;
	}

	public Optional<Ability> getAbility(Long id) {
		return abilityRepository.findById(id);
	}

	public List<Ability> getAllAbilities() {
		return abilityRepository.findAll();
	}

	public String createAbility(Ability ability) {
		abilityRepository.saveAndFlush(ability);
		return "The ability: " + ability.getName() + " has been created.";
	}

	public String updateAbility(Ability ability) {
		abilityRepository.saveAndFlush(ability);
		return "The ability: " + ability.getName() + " has been updated." ;
	}

	public String deleteAbility(Long id) {
		abilityRepository.deleteById(id);
		return "The ability with the ID: " + id + " has been deleted.";
	}
	
}

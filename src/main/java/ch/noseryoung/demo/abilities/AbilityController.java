package ch.noseryoung.demo.abilities;

import java.util.ArrayList;

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

import ch.noseryoung.demo.abilities.Ability;

/** This class is the controller of abilities.
 * 
 * @author scheidmann
 */

@RestController
@RequestMapping("/ability")
public class AbilityController {
	
	private AbilityService abilityService;
	
	@Autowired
	public AbilityController(AbilityService abilityService) {
		this.abilityService = abilityService;
	}
	
	/** This method returns a specific ability
	 * 
	 * @param id
	 * @return ResposneEntity returns the requested ability
	 */
	@GetMapping("/{id}")
	public @ResponseBody ResponseEntity<Ability> getAbility(@PathVariable Long id) {
		Ability ability = abilityService.getAbility(id);
		return new ResponseEntity<Ability>(ability, HttpStatus.OK);
	}
	
	/** This method returns all abilities
	 * 
	 * @return ResponseEntity returns all abilities
	 */
	@GetMapping({"", "/"})
	public @ResponseBody ResponseEntity<ArrayList<Ability>> getAllAbility() {
		ArrayList<Ability> abilities = abilityService.getAllAbilities();
		return new ResponseEntity<ArrayList<Ability>>(abilities, HttpStatus.OK);
	}
	
	/** This method creates a ability
	 * 
	 * @param ability
	 * @return ResponseEntity returns a confirmation that the ability has been created
	 */
	@PostMapping({"/", ""})
	public @ResponseBody ResponseEntity<String> createAbility(@RequestBody Ability ability) {
		String msg = abilityService.createAbility(ability);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	/** This method updates a specific ability
	 * 
	 * @param ability
	 * @return ResponseEntity returns a confirmation that the ability has been updated
	 */
	@PutMapping({"/", ""})
	public @ResponseBody ResponseEntity<String> updateAbility(@RequestBody Ability ability) {
		String msg = abilityService.updateAbility(ability);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	/** This method deletes a specific ability
	 * 
	 * @param id
	 * @return ResponseEntity returns a confirmation that the ability has been deleted
	 */
	@DeleteMapping("/{id}")
	public @ResponseBody ResponseEntity<String> deleteAbility(@PathVariable Long id) {
		String msg = abilityService.deleteAbility(id);
		return new ResponseEntity<String>(msg, HttpStatus.NO_CONTENT);
	}
	
}

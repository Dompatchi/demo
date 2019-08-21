package ch.noseryoung.demo;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
	
	@GetMapping("/{id}")
	public @ResponseBody ResponseEntity<Pokemon> getPokemon(@PathVariable Long id) {
		ArrayList<Typing> resistantAgainst = new ArrayList<>();
		ArrayList<Typing> weakAgainst = new ArrayList<>();
		ArrayList<Typing> strongAgainst = new ArrayList<>();
		Typing typing = new Typing("Fighting", resistantAgainst, weakAgainst, strongAgainst);
		ArrayList<Typing> typings = new ArrayList<>();
		typings.add(typing);
		
		Ability innerFocus = new Ability("Inner focus", "This pokemon cannot flinch.");
		Ability regenerator;
		Ability reckless;
		ArrayList<Ability> abilities = new ArrayList<>();
		abilities.add(innerFocus);
		
		
		Pokemon pokemon = new Pokemon();
		pokemon.setId(id);
		pokemon.setHealth(65);
		pokemon.setAttack(125);
		pokemon.setDefense(60);
		pokemon.setSpecialAttack(95);
		pokemon.setSpecialDefense(60);
		pokemon.setSpeed(105);
		pokemon.setAbilities(abilities);
		pokemon.setType(typings);
		
		return new ResponseEntity<Pokemon>(pokemon, HttpStatus.OK);
	}
	
	@PostMapping("/")
	public @ResponseBody ResponseEntity<String> createPokemon(@RequestBody Pokemon pokemon) {
		return new ResponseEntity<String>(pokemon.getName() + " has been created ^^", HttpStatus.OK);
	}
}
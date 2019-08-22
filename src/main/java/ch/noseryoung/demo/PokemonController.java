package ch.noseryoung.demo;

import java.util.ArrayList;

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
		Ability regenerator = new Ability("Regenerator", "Heals a bit when switched out.");
		Ability reckless = new Ability("Reckless", "Moves that have recoil or crash damage deal more damage.");
		ArrayList<Ability> abilities = new ArrayList<>();
		abilities.add(innerFocus);
		abilities.add(regenerator);
		abilities.add(reckless);
				
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
	
	@GetMapping({"", "/"})
	public @ResponseBody ResponseEntity<ArrayList<Pokemon>> getAllPokemon() {
		ArrayList<Typing> resistantAgainst = new ArrayList<>();
		ArrayList<Typing> weakAgainst = new ArrayList<>();
		ArrayList<Typing> strongAgainst = new ArrayList<>();
		Typing typing = new Typing("Fighting", resistantAgainst, weakAgainst, strongAgainst);
		ArrayList<Typing> typings = new ArrayList<>();
		typings.add(typing);
		
		Ability innerFocus = new Ability("Inner focus", "This pokemon cannot flinch.");
		Ability regenerator = new Ability("Regenerator", "Heals a bit when switched out.");
		Ability reckless = new Ability("Reckless", "Moves that have recoil or crash damage deal more damage.");
		ArrayList<Ability> abilities = new ArrayList<>();
		abilities.add(innerFocus);
		abilities.add(regenerator);
		abilities.add(reckless);
		
		
		Pokemon mienshao = new Pokemon();
		mienshao.setId(Long.parseLong("620"));
		mienshao.setHealth(65);
		mienshao.setAttack(125);
		mienshao.setDefense(60);
		mienshao.setSpecialAttack(95);
		mienshao.setSpecialDefense(60);
		mienshao.setSpeed(105);
		mienshao.setAbilities(abilities);
		mienshao.setType(typings);
		
		Pokemon mienfoo = new Pokemon();
		mienfoo.setId(Long.parseLong("619"));
		mienfoo.setHealth(45);
		mienfoo.setAttack(85);
		mienfoo.setDefense(50);
		mienfoo.setSpecialAttack(55);
		mienfoo.setSpecialDefense(50);
		mienfoo.setSpeed(65);
		mienfoo.setAbilities(abilities);
		mienfoo.setType(typings);
		
		
		ArrayList<Pokemon> pokemons = new ArrayList<>();
		pokemons.add(mienfoo);
		pokemons.add(mienshao);
		
		return new ResponseEntity<ArrayList<Pokemon>>(pokemons, HttpStatus.OK);
	}
	
	@PostMapping({"/", ""})
	public @ResponseBody ResponseEntity<String> createPokemon(@RequestBody Pokemon pokemon) {
		return new ResponseEntity<String>(pokemon.getName() + " has been created ^^", HttpStatus.CREATED);
	}
	
	@PutMapping({"/", ""})
	public @ResponseBody ResponseEntity<String> updatePokemon(@RequestBody Pokemon pokemon) {
		return new ResponseEntity<String>(pokemon.getName() + " has been updated", HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public @ResponseBody ResponseEntity<String> deletePokemon(@PathVariable Long id) {
		return new ResponseEntity<String>("The pokemon with the ID: " + id +" has been deleted", HttpStatus.NO_CONTENT);
	}	
}
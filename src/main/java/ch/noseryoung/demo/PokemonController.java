package ch.noseryoung.demo;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
	
	@GetMapping({"/{id}"})
	public @ResponseBody ResponseEntity<Pokemon> getPokemon(@PathVariable Long id) {
		ArrayList<String> typing = new ArrayList<>();
		typing.add("Grass");
		
		HashMap<String, Integer> stats = new HashMap<>();
		stats.put("Health", 75);
		stats.put("Attack", 86);
		stats.put("Defense", 67);
		stats.put("Special Attack", 106);
		stats.put("Special Defense", 67);
		stats.put("Speed", 60);
		
		return new ResponseEntity<Pokemon>(new Pokemon(id, "Maractus", typing, stats), HttpStatus.OK);
	}
}

package ch.noseryoung.demo.pokemons;

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
import ch.noseryoung.demo.typings.Typing;

/** This class is the controller of pokemons.
 * 
 * 
 * @author haru
 */

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
	
	PokemonService pokemonService;
	
	@Autowired
	public PokemonController(PokemonService pokemonService) {
		this.pokemonService = pokemonService;
	}
	
	/** This method returns a specific pokemon
	 * 
	 * @param id
	 * @return ResposneEntity returns the requested pokemon
	 */
	@GetMapping("/{id}")
	public @ResponseBody ResponseEntity<Pokemon> getPokemon(@PathVariable Long id) {
		Pokemon pokemon = pokemonService.getPokemon(id);
		return new ResponseEntity<Pokemon>(pokemon, HttpStatus.OK);
	}
	
	/** This method returns all pokemons
	 * 
	 * @return ResponseEntity returns all pokemons
	 */
	@GetMapping({"", "/"})
	public @ResponseBody ResponseEntity<ArrayList<Pokemon>> getAllPokemon() {
		ArrayList<Pokemon> pokemons = pokemonService.getAllPokemons();
		return new ResponseEntity<ArrayList<Pokemon>>(pokemons, HttpStatus.OK);
	}
	
	/** This method creates a pokemon
	 * 
	 * @param pokemon
	 * @return ResponseEntity returns a confirmation that the pokemon has been created
	 */
	@PostMapping({"/", ""})
	public @ResponseBody ResponseEntity<String> createPokemon(@RequestBody Pokemon pokemon) {
		String msg = pokemonService.createPokemon(pokemon);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	/** This method updates a specific pokemon
	 * 
	 * @param pokemon
	 * @return ResponseEntity returns a confirmation that the pokemon has been updated
	 */
	@PutMapping({"/", ""})
	public @ResponseBody ResponseEntity<String> updatePokemon(@RequestBody Pokemon pokemon) {
		String msg = pokemonService.updatePokemon(pokemon);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	/** This method deletes a specific pokemon
	 * 
	 * @param id
	 * @return ResponseEntity returns a confirmation that the pokemon has been deleted
	 */
	@DeleteMapping("/{id}")
	public @ResponseBody ResponseEntity<String> deletePokemon(@PathVariable Long id) {
		String msg = pokemonService.deletePokemon(id);
		return new ResponseEntity<String>(msg, HttpStatus.NO_CONTENT);
	}	
}
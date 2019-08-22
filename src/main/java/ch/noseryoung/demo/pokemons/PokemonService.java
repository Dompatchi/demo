package ch.noseryoung.demo.pokemons;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import ch.noseryoung.demo.abilities.Ability;
import ch.noseryoung.demo.typings.Typing;

@Service
public class PokemonService {
	public Pokemon getPokemon(Long id) {
		ArrayList<Typing> resistantAgainst = new ArrayList<>();		
		ArrayList<Typing> weakAgainst = new ArrayList<>();
		ArrayList<Typing> strongAgainst = new ArrayList<>();
		ArrayList<Typing> immuneAgainst = new ArrayList<>();
		Typing typing = new Typing("Fighting", resistantAgainst, weakAgainst, strongAgainst, immuneAgainst);
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
		pokemon.setName("Mienshao");
		pokemon.setHealth(65);
		pokemon.setAttack(125);
		pokemon.setDefense(60);
		pokemon.setSpecialAttack(95);
		pokemon.setSpecialDefense(60);
		pokemon.setSpeed(105);
		pokemon.setAbilities(abilities);
		pokemon.setType(typings);
		
		return pokemon;
	}
	
	public ArrayList<Pokemon> getAllPokemons() {
		ArrayList<Typing> resistantAgainst = new ArrayList<>();
		ArrayList<Typing> weakAgainst = new ArrayList<>();
		ArrayList<Typing> strongAgainst = new ArrayList<>();
		ArrayList<Typing> immuneAgainst = new ArrayList<>();
		Typing typing = new Typing("Fighting", resistantAgainst, weakAgainst, strongAgainst, immuneAgainst);
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
		mienshao.setName("Mienshao");
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
		mienfoo.setName("Mienfoo");
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
		return pokemons;
	}
	
	public String createPokemon(Pokemon pokemon) {
		return pokemon.getName() + " has been created.";
	}
	
	public String updatePokemon(Pokemon pokemon) {
		return pokemon.getName() + " has been updated.";
	}
	
	public String deletePokemon(Long id) {
		return "The pokemon with the ID: " + id +" has been deleted.";
	}
}

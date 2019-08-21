package ch.noseryoung.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class Pokemon {
	private Long id;
	private String name;
	private ArrayList<String> typing;
	private HashMap<String, Integer> stats;
	
	/**
	 * @param id
	 * @param name
	 * @param typing
	 * @param stats
	 */
	public Pokemon(Long id, String name, ArrayList<String> typing, HashMap<String, Integer> stats) {
		super();
		this.id = id;
		this.name = name;
		this.typing = typing;
		this.stats = stats;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the typing
	 */
	public ArrayList<String> getTyping() {
		return typing;
	}

	/**
	 * @param typing the typing to set
	 */
	public void setTyping(ArrayList<String> typing) {
		this.typing = typing;
	}

	/**
	 * @return the stats
	 */
	public HashMap<String, Integer> getStats() {
		return stats;
	}

	/**
	 * @param stats the stats to set
	 */
	public void setStats(HashMap<String, Integer> stats) {
		this.stats = stats;
	}
	
	
	
}

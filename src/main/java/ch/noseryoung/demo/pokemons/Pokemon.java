package ch.noseryoung.demo.pokemons;

import java.util.ArrayList;

import ch.noseryoung.demo.abilities.Ability;
import ch.noseryoung.demo.typings.Typing;

public class Pokemon {
	private Long id;
	private String name;
	private ArrayList<Typing> type;
	private Integer health;
	private Integer attack;
	private Integer defense;
	private Integer specialAttack;
	private Integer specialDefense;
	private Integer speed;
	private ArrayList<Ability> abilities;
	
	public Pokemon() {}
	
	/**
	 * @param id
	 * @param name
	 * @param type
	 * @param health
	 * @param attack
	 * @param defense
	 * @param specialAttack
	 * @param specialDefense
	 * @param speed
	 * @param abilities
	 */
	public Pokemon(Long id, String name, ArrayList<Typing> type, Integer health, Integer attack, Integer defense,
			Integer specialAttack, Integer specialDefense, Integer speed, ArrayList<Ability> abilities) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.health = health;
		this.attack = attack;
		this.defense = defense;
		this.specialAttack = specialAttack;
		this.specialDefense = specialDefense;
		this.speed = speed;
		this.abilities = abilities;
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
	 * @return the type
	 */
	public ArrayList<Typing> getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(ArrayList<Typing> type) {
		this.type = type;
	}
	/**
	 * @return the health
	 */
	public Integer getHealth() {
		return health;
	}
	/**
	 * @param health the health to set
	 */
	public void setHealth(Integer health) {
		this.health = health;
	}
	/**
	 * @return the attack
	 */
	public Integer getAttack() {
		return attack;
	}
	/**
	 * @param attack the attack to set
	 */
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	/**
	 * @return the defense
	 */
	public Integer getDefense() {
		return defense;
	}
	/**
	 * @param defense the defense to set
	 */
	public void setDefense(Integer defense) {
		this.defense = defense;
	}
	/**
	 * @return the specialAttack
	 */
	public Integer getSpecialAttack() {
		return specialAttack;
	}
	/**
	 * @param specialAttack the specialAttack to set
	 */
	public void setSpecialAttack(Integer specialAttack) {
		this.specialAttack = specialAttack;
	}
	/**
	 * @return the specialDefense
	 */
	public Integer getSpecialDefense() {
		return specialDefense;
	}
	/**
	 * @param specialDefense the specialDefense to set
	 */
	public void setSpecialDefense(Integer specialDefense) {
		this.specialDefense = specialDefense;
	}
	/**
	 * @return the speed
	 */
	public Integer getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	/**
	 * @return the abilities
	 */
	public ArrayList<Ability> getAbilities() {
		return abilities;
	}
	/**
	 * @param abilities the abilities to set
	 */
	public void setAbilities(ArrayList<Ability> abilities) {
		this.abilities = abilities;
	}
}

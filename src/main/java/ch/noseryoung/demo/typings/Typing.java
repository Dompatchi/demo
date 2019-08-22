package ch.noseryoung.demo.typings;

import java.util.ArrayList;


public class Typing {
	private Long id;
	private String name;
	private ArrayList<Typing> resistantAgainst;
	private ArrayList<Typing> weakAgainst;
	private ArrayList<Typing> strongAgainst;
	private ArrayList<Typing> immuneAgainst;
	/**
	 * @param name
	 * @param resistantAgainst
	 * @param weakAgainst
	 * @param strongAgainst
	 * @param immuneAgainst
	 */
	public Typing(Long id, String name, ArrayList<Typing> resistantAgainst, ArrayList<Typing> weakAgainst,
			ArrayList<Typing> strongAgainst, ArrayList<Typing> immuneAgainst) {
		super();
		this.id = id;
		this.name = name;
		this.resistantAgainst = resistantAgainst;
		this.weakAgainst = weakAgainst;
		this.strongAgainst = strongAgainst;
		this.immuneAgainst = immuneAgainst;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Typing> getResistantAgainst() {
		return resistantAgainst;
	}
	public void setResistantAgainst(ArrayList<Typing> resistantAgainst) {
		this.resistantAgainst = resistantAgainst;
	}
	public ArrayList<Typing> getWeakAgainst() {
		return weakAgainst;
	}
	public void setWeakAgainst(ArrayList<Typing> weakAgainst) {
		this.weakAgainst = weakAgainst;
	}
	public ArrayList<Typing> getStrongAgainst() {
		return strongAgainst;
	}
	public void setStrongAgainst(ArrayList<Typing> strongAgainst) {
		this.strongAgainst = strongAgainst;
	}
	public ArrayList<Typing> getImmuneAgainst() {
		return immuneAgainst;
	}
	public void setImmuneAgainst(ArrayList<Typing> immuneAgainst) {
		this.immuneAgainst = immuneAgainst;
	}
	
}
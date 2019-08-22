package ch.noseryoung.demo;

import java.util.ArrayList;

public class Typing {
	private String name;
	private ArrayList<Typing> resistantAgainst;
	private ArrayList<Typing> weakAgainst;
	private ArrayList<Typing> strongAgainst;
	/**
	 * @param name
	 * @param resistantAgainst
	 * @param weakAgainst
	 * @param strongAgainst
	 */
	public Typing(String name, ArrayList<Typing> resistantAgainst, ArrayList<Typing> weakAgainst,
			ArrayList<Typing> strongAgainst) {
		super();
		this.name = name;
		this.resistantAgainst = resistantAgainst;
		this.weakAgainst = weakAgainst;
		this.strongAgainst = strongAgainst;
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
	 * @return the resistantAgainst
	 */
	public ArrayList<Typing> getResistantAgainst() {
		return resistantAgainst;
	}
	/**
	 * @param resistantAgainst the resistantAgainst to set
	 */
	public void setResistantAgainst(ArrayList<Typing> resistantAgainst) {
		this.resistantAgainst = resistantAgainst;
	}
	/**
	 * @return the weakAgainst
	 */
	public ArrayList<Typing> getWeakAgainst() {
		return weakAgainst;
	}
	/**
	 * @param weakAgainst the weakAgainst to set
	 */
	public void setWeakAgainst(ArrayList<Typing> weakAgainst) {
		this.weakAgainst = weakAgainst;
	}
	/**
	 * @return the strongAgainst
	 */
	public ArrayList<Typing> getStrongAgainst() {
		return strongAgainst;
	}
	/**
	 * @param strongAgainst the strongAgainst to set
	 */
	public void setStrongAgainst(ArrayList<Typing> strongAgainst) {
		this.strongAgainst = strongAgainst;
	}
}

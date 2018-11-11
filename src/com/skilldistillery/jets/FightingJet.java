package com.skilldistillery.jets;

public abstract class FightingJet extends Jet {

	private String explosionsEmoji = new String(Character.toChars(0x1F4A5));
	

	public FightingJet(String model, int speedInMPH, int rangeInMiles, int price) {
		super(model, speedInMPH, rangeInMiles, price);
		// TODO Auto-generated constructor stub
	}

	public void kamakazie() {
		System.out.println(" is going down, hopefully hitting an emeny target...KAAAAABBOOOOOMMM!!!!" + explosionsEmoji);
	}
		
	public void takeDamage() {
		System.out.println("is hit and going down.....BOOOOMMMM!!! " + explosionsEmoji);
	}
	
	public void evasiveManuver() {
		System.out.println(" Just did a barrel roll!");
	}
	
	abstract void attack(FightingJet chosenJetToDestory);
	
	abstract void fireAllWeapons();
	
	abstract void reloadAllWeapons();
	
	


	
}
	


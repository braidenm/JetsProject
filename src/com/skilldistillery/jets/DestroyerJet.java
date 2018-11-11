package com.skilldistillery.jets;

public class DestroyerJet extends FightingJet implements CanShootMissiles, CanShoot {
	
	public final int MAX_MISSILES, MAX_BULLETS;
	public int numMissiles, numBullets;
	private final String explosionsEmoji = new String(Character.toChars(0x1F4A5));
	private final String missileEmoji = new String(Character.toChars(0x1F680));

	public DestroyerJet(String model, double speedInMPH, double rangeInMiles, int price, int MAX_BULLETS, int MAX_MISSILES) {
		super(model, speedInMPH, rangeInMiles, price);
		this.MAX_BULLETS = MAX_BULLETS;
		this.numBullets = MAX_BULLETS;
		this.MAX_MISSILES = MAX_MISSILES;
		this.numMissiles = MAX_MISSILES;
	}
	
	@Override
	public void shooting() {
		System.out.println(super.getModel() + " Pew pew");
		System.out.println("out of bullets now, reload");
		this.numBullets = 0;
	}

	@Override
	public void fireMissiles() {

		System.out.println("Missiles away!!!" + missileEmoji);
		System.out.println("Out of missiles, must reload");
		this.numMissiles = 0;

	}
	
	@Override
	public void attack(FightingJet enemy) {
		System.out.println(super.getModel() + "just fired all bullets and missiles at " + enemy.getModel());
		this.numBullets = 0;
		this.numMissiles = 0;
	}

	@Override
	public void fireAllWeapons() {

		System.out.println("ALL GUNS FIRE!!!" + missileEmoji + explosionsEmoji);
		System.out.println(super.getModel() + " out of bullets and missiles now");
		this.numBullets = 0;
		this.numMissiles = 0;
	}

	@Override
	public void reloadAllWeapons() {
		System.out.println(super.getModel() + "Fully reloaded");
		this.numBullets = MAX_BULLETS;
		this.numMissiles = MAX_MISSILES;
	}

	@Override
	public String toString() {
		return "" + super.getPilot()+ "\nDestroyerJet [model= "+ super.getModel() + ", speedInMPH= " + super.getSpeedInMPH()+ ", rangeInMiles= " + super.getRangeInMiles() + ", price= $"
				+ super.getPrice() + ", MAX_BULLETS= " + MAX_BULLETS + ", MAX_MISSILES= " + MAX_MISSILES + "]\n" ;
	}
	@Override
	public void kamakazie() {
		System.out.println(super.getModel()+ " is going down, hopefully hitting an emeny target...KAAAAABBOOOOOMMM!!!!" + explosionsEmoji);
	}
	@Override
	public void takeDamage() {
		System.out.println(super.getModel()+" is hit and going down.....BOOOOMMMM!!! " + explosionsEmoji);
	}
	@Override
	public void evasiveManuver() {
		System.out.println(super.getModel()+" Just did a barrel roll!");
	}
	@Override
	public int getNumMissiles() {
		return numMissiles;
	}

	@Override
	public int getNumBullets() {
		return numBullets;
	}

	public int getMAX_MISSILES() {
		return MAX_MISSILES;
	}

	public int getMAX_BULLETS() {
		return MAX_BULLETS;
	}
	

	


}

package com.skilldistillery.jets;

public class DogFightJet extends FightingJet implements CanShoot {

	private final int MAX_BULLETS;
	private int numBullets;
	private final String explosionsEmoji = new String(Character.toChars(0x1F4A5));


	public DogFightJet(String model, double speedInMPH, double rangeInMiles, int price, int MAX_BULLETS) {
		super(model, speedInMPH, rangeInMiles, price);
		this.MAX_BULLETS = MAX_BULLETS;
		this.numBullets = MAX_BULLETS;
	}

	@Override
	public void shooting() {
		System.out.println(super.getModel() + "Pew pew" + explosionsEmoji);
		System.out.println("out of bullets now, reload");
		this.numBullets = 0;
	}

	@Override
	public void attack(FightingJet enemy) {
		System.out.println(super.getModel() + "just fired all bullets at " + enemy.getModel() + explosionsEmoji);
		this.numBullets = 0;
	}

	@Override
	public void fireAllWeapons() {
		System.out.println("ALL GUNS FIRE!!!" + explosionsEmoji);
		System.out.println(super.getModel() + " out of bullets now");
		this.numBullets = 0;
	}

	@Override
	public void reloadAllWeapons() {
		System.out.println(super.getModel() + "Fully reloaded");
		this.numBullets = this.MAX_BULLETS;
	}
	@Override
	public void kamakazie() {
		System.out.println(super.getModel()+ " is going down, hopefully hitting an emeny target...KAAAAABBOOOOOMMM!!!!" + explosionsEmoji);
	}
	@Override
	public void takeDamage() {
		System.out.println(super.getModel()+"is hit and going down.....BOOOOMMMM!!! " + explosionsEmoji);
	}
	@Override
	public void evasiveManuver() {
		System.out.println(super.getModel()+" Just did a barrel roll!");
	}
	@Override
	public int getNumBullets() {
		return numBullets;
	}


	public int getMAX_BULLETS() {
		return MAX_BULLETS;
	}
	public void emptyBullets() {
		this.numBullets = 0;
	}

	@Override
	public String toString() {
		return "" + super.getPilot()+ "\nDogFightJet [model= "+ super.getModel() + ", speedInMPH= " + super.getSpeedInMPH()+ ", rangeInMiles= " + super.getRangeInMiles() + ", price= $" +  
				+ super.getPrice() + ", MAX_BULLETS= " + MAX_BULLETS + "]\n";
	}
	

	//Realized this was redundant
//	public void setNumBullets(int numBullets) {
//		if (numBullets <= this.getMAX_BULLETS()) {
//			
//			this.numBullets = numBullets;
//		} else {
//			System.out.println("Can only hold " + this.getMAX_BULLETS() + " bombs. Bombs are now full");
//			this.numBullets = this.getMAX_BULLETS();
//		}
//	}
}

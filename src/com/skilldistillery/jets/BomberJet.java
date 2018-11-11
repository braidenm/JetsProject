package com.skilldistillery.jets;

public class BomberJet extends FightingJet implements CanBomb {
	
	private final int MAX_BOMBS;
	private int numBombs;
	private final String explosionsEmoji = new String(Character.toChars(0x1F4A5));
	private final String bombEmoji = new String(Character.toChars(0x1F4A3));
	

	public BomberJet(String model, double speedInMPH, double rangeInMiles, int price, int MAX_BOMBS) {
		super(model, speedInMPH, rangeInMiles, price);
		this.MAX_BOMBS = MAX_BOMBS;
		this.numBombs = MAX_BOMBS;
	}

	@Override
	public void attack(FightingJet enemy) {
		bomb();
		System.out.println(super.getModel() + " justed Bombed "+bombEmoji + enemy.getModel() + explosionsEmoji + " and is out of bombs now, must reload");
		numBombs = 0;
	}
	@Override
	public void fireAllWeapons() {

		System.out.println("About to drop " + this.getNumBombs()+ " bombs! ");
		bomb();
		System.out.println(explosionsEmoji+ explosionsEmoji);
		System.out.println(super.getModel() + " is out of bombs now, must reload");
		numBombs = 0;
	}
	@Override
	public void reloadAllWeapons() {
		System.out.println(super.getModel() + "Fully reloaded");
		numBombs = MAX_BOMBS;
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
	public int getNumBombs() {
		return numBombs;
	}

	@Override
	public String toString() {
		return "" + super.getPilot()+ "\nBomberJet [model= "+ super.getModel() + ", speedInMPH= " + super.getSpeedInMPH()+ ", rangeInMiles= "
				+ super.getRangeInMiles() + ", price= $" + 
				+ super.getPrice() + ", MAX_BOMBS= " + MAX_BOMBS + "]\n";
	}

	public int getMAX_BOMBS() {
		return MAX_BOMBS;
	}
	

//	Realized this was redundant.
//	public void setNumBombs(int numBombs) {
//		if (numBombs <= this.getMAX_BOMBS()) {
//		
//		this.numBombs = numBombs;
//		}
//		else {
//			System.out.println("Can only hold " + this.getMAX_BOMBS() + " bombs. Bombs are now full");
//			this.numBombs = this.getMAX_BOMBS();
//		}
//	}
	
	

}

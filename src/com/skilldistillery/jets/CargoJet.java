package com.skilldistillery.jets;

public class CargoJet extends Jet implements CanCarryStuff {

	private final int MAX_LOAD;
	private int load;
	
	
	

	public CargoJet(String model, double speedInMPH, double rangeInMiles, int price, int MAX_LOAD) {
		super(model, speedInMPH, rangeInMiles, price);
		this.MAX_LOAD = MAX_LOAD;
	}

	@Override
	public int getLoad() {
		return load;
	}

	@Override
	public void unloadPlane() {
		System.out.println("plane is now unloaded.");
		load = 0;
	}

	public int getMAX_LOAD() {
		return MAX_LOAD;
	}

	public void setLoad() {
		System.out.println("You loaded the AirCraft for :" + super.getModel());
		this.load = MAX_LOAD;
	}

	@Override
	public String toString() {
		return "" + super.getPilot() + "\nCargoJet model= "+ super.getModel() + ", speedInMPH= " + super.getSpeedInMPH()+ ", rangeInMiles= "
				+ super.getRangeInMiles() + ", price= $" + super.getPrice() + ", MAX_LOAD= " + MAX_LOAD + "]\n" ;
	}
	
	
	

}

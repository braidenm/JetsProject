package com.skilldistillery.jets;

public abstract class Jet {
	private final String model;

	private final double speedInMPH, rangeInMiles;
	private int price;
	private Pilot pilot;


	public Jet(String model, double speedInMPH, double rangeInMiles, int price) {
		super();
		this.model = model;
		this.speedInMPH = speedInMPH;
		this.rangeInMiles = rangeInMiles;
		this.price = price;
	}
	

	public double getSpeedInMach() {
		return Math.round((speedInMPH / 767.269) * 100.0) / 100.0;
	}
	public double getTimeFlying() {
		return Math.round((rangeInMiles / speedInMPH) * 100.0) / 100.0;
	}

	public void fly() {
		String planeEmoji = new String(Character.toChars(0x2708));
		StringBuilder flyingInfo = new StringBuilder("Speed in MPH: " + speedInMPH + "\nIn MAchs: " +this.getSpeedInMach()+ 
				"\nDistance: " + rangeInMiles +
				"\nTime in the Air: " + this.getTimeFlying()+ " hours.");
		
		System.out.println(this.getPilot() + " is flying the "+model + planeEmoji);
		System.out.println(flyingInfo);
		System.out.println();
		
	}

	public String getModel() {
		return model;
	}

	public double getSpeedInMPH() {
		return speedInMPH;
	}

	public double getRangeInMiles() {
		return rangeInMiles;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "" + this.getPilot() + "\nBasic Jet [model=" + model + ", speedInMPH=" + speedInMPH + ", rangeInMiles=" + rangeInMiles + ", price= $"
				+ price + "]\n";
	}


	public Pilot getPilot() {
		return pilot;
	}


	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

}

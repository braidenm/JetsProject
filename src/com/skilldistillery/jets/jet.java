package com.skilldistillery.jets;

public abstract class Jet {
	private final String model;

	private final int speedInMPH, rangeInMiles;
	private int price;


	public Jet(String model, int speedInMPH, int rangeInMiles, int price) {
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
				"\niDistance: " + rangeInMiles +
				"\nI can fly for " + this.getTimeFlying()+ " hours.");
		
		System.out.println("Its me the "+model+ " and I am Flying! " + planeEmoji);
		System.out.println(flyingInfo);
		System.out.println();
		
	}

	public String getModel() {
		return model;
	}

	public int getSpeedInMPH() {
		return speedInMPH;
	}

	public int getRangeInMiles() {
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
		return "Basic Jet [model=" + model + ", speedInMPH=" + speedInMPH + ", rangeInMiles=" + rangeInMiles + ", price= $"
				+ price + "]";
	}

}

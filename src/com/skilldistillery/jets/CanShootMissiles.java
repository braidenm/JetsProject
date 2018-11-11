package com.skilldistillery.jets;

public interface CanShootMissiles extends CanShoot {
	
	
	default void fireMissilesAtTarget(Jet enemy) {
		String missileEmoji = new String(Character.toChars(0x1F680));
		StringBuilder firingMissiles = new StringBuilder("Firing missiles at " + enemy + " " + missileEmoji);
		System.out.println(firingMissiles);
	
	}
	void fireMissiles();
	
	int getNumMissiles();

}
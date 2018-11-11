package com.skilldistillery.jets;


public interface CanBomb {
	
	default void bomb() {
		String bombEmoji = new String(Character.toChars(0x1F4A3));
		StringBuilder bombing = new StringBuilder("Bombs away!! " + bombEmoji + bombEmoji + bombEmoji );
		System.out.println(bombing);
	}
	int getNumBombs();
	
	
	
}


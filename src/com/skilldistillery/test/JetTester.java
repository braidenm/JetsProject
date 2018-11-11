package com.skilldistillery.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JetTester {

	@Test
	void test_if_speed_to_mach_calculator_gives_back_expected_value() {
		int speedInMPH = 1875;
		
		
		
		assertEquals(2.444, Math.round((speedInMPH / 767.269)*1000.0)/1000.0 );
	}

}

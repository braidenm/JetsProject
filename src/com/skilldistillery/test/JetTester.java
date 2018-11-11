package com.skilldistillery.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JetTester {

	@Test
	void test_if_speed_to_mach_calculator_gives_back_expected_value() {
		int speedInMPH = 1875;
		
		
		
		assertEquals(2.444, Math.round((speedInMPH / 767.269)*1000.0)/1000.0 );
	}
	
	@Test
	void test_if_get_time_flying_gives_expected_result_when_range_is_less_than_speed() {
		double timeFlying, rangeInMiles, speedInMPH;
		rangeInMiles=500.0;
		speedInMPH = 1500.0;
		
			timeFlying = Math.round((rangeInMiles / speedInMPH) * 100.0) / 100.0;
		assertEquals(0.33, timeFlying);
	}

}

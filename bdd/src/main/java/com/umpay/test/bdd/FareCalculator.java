package com.umpay.test.bdd;

import java.math.BigDecimal;

public interface FareCalculator {

	/**
	 * Returns price in GBP for a given distance in miles.
	 */
	Money calculateFare(BigDecimal distance);

}

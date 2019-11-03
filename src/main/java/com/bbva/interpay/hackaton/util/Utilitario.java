/**
 * 
 */
package com.bbva.interpay.hackaton.util;
import java.util.Random;

/**
 * @author P019956
 *
 */
public class Utilitario {
	
	private static Random rand = new Random();

	
	public static int generateRandomIntIntRange() {
		int min = 10000;
		int max = 99999;
	    return rand.nextInt((max - min) + 1) + min;
	}
	
	private Utilitario() {
		throw new IllegalStateException("Utility class");
	}

}

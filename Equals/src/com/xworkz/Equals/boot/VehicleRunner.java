package com.xworkz.Equals.boot;

import com.xworkz.Equals.thing.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle gaadi = new Vehicle("Suzuki", "red", 150, 135000, "petrol", false, false, 2022, 2037, false);
		System.out.println(gaadi);
		Vehicle gaadi1 = new Vehicle("yamaha", "black", 100, 145000, "petrol", false, false, 1988, 2050, true);
		System.out.println(gaadi1);

		gaadi = gaadi1;
		boolean Alrounder = gaadi.equals(gaadi1);
		System.out.println(Alrounder);

		gaadi = gaadi1;
		boolean sound = gaadi.equals(gaadi1);
		System.out.println(sound);
	}

}

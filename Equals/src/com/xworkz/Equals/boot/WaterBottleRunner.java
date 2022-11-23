package com.xworkz.Equals.boot;

import com.xworkz.Equals.thing.WaterBottle;

public class WaterBottleRunner {
	public static void main(String[] args) {
		WaterBottle neeru = new WaterBottle("Bisleri", "no color", 5, 70, "can", false, true, 2022, 2023, true);
		System.out.println(neeru);
		WaterBottle neeru1 = new WaterBottle("tata", "no color", 1, 20, "bottle", false, false, 2022, 2023, true);
		System.out.println(neeru1);

		neeru = neeru1;
		boolean lifesaver1 = neeru.equals(neeru1);
		System.out.println(lifesaver1);

		neeru = neeru1;
		boolean lifesaver2 = neeru.equals(neeru1);
		System.out.println(lifesaver2);

		neeru = neeru1;
		boolean lifesaver3 = neeru.equals(neeru1);
		System.out.println(lifesaver3);
	}

}

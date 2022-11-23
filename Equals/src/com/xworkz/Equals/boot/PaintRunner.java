package com.xworkz.Equals.boot;

import com.xworkz.Equals.thing.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		Paint banna = new Paint("Berger", "lemon Yellow", 1, 350, "box", true, true, 2022, 2028, true);
		System.out.println(banna);
		Paint banna1 = new Paint("Asian", "RED", 1, 400, "box", false, true, 2022, 2028, true);
		System.out.println(banna1);

		banna = banna1;
		boolean wall = banna.equals(banna1);
		System.out.println(wall);
	}

}

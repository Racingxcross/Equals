package com.xworkz.Equals.boot;

import com.xworkz.Equals.thing.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {

		Hospital Miracle = new Hospital("Nimhans", "white", 200, 150, "mental treatment", true, true, 1954, 926995201,
				true);
		System.out.println(Miracle);
		Hospital Miracle1 = new Hospital("Narayana Hrudayalaya", "white", 500, 500, "All", true, true, 2000, 967506870,
				true);
		System.out.println(Miracle1);

		Miracle = Miracle1;
		Miracle.equals(Miracle1);
		System.out.println("worship");

		Miracle = Miracle1;
		Miracle.equals(Miracle1);
		System.out.println("worship1");

	}

}

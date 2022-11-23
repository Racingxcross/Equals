package com.xworkz.Equals.thing;

public class Vehicle {

	private String brand;
	private String colour;
	private int cc;
	private double price;
	private String type;
	private boolean ecofriendly;
	private boolean weight;
	private long mtgdate;
	private long expdate;
	private boolean speed;

	public Vehicle(String brand, String colour, int cc, double price, String type, boolean ecofriendly, boolean weight,
			long mtgdate, long expdate, boolean speed) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.cc = cc;
		this.price = price;
		this.type = type;
		this.ecofriendly = ecofriendly;
		this.weight = weight;
		this.mtgdate = mtgdate;
		this.expdate = expdate;
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isEcofriendly() {
		return ecofriendly;
	}

	public void setEcofriendly(boolean ecofriendly) {
		this.ecofriendly = ecofriendly;
	}

	public boolean isWeight() {
		return weight;
	}

	public void setWeight(boolean weight) {
		this.weight = weight;
	}

	public long getMtgdate() {
		return mtgdate;
	}

	public void setMtgdate(long mtgdate) {
		this.mtgdate = mtgdate;
	}

	public long getExpdate() {
		return expdate;
	}

	public void setExpdate(long expdate) {
		this.expdate = expdate;
	}

	public boolean isSpeed() {
		return speed;
	}

	public void setSpeed(boolean speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", colour=" + colour + ", cc=" + cc + ", price=" + price + ", type=" + type
				+ ", ecofriendly=" + ecofriendly + ", weight=" + weight + ", mtgdate=" + mtgdate + ", expdate="
				+ expdate + ", speed=" + speed + "]";
	}
	public boolean equals(Object objt) {
		if (objt instanceof Vehicle) {
			Vehicle casted = (Vehicle) objt;
			if (this.brand.equals(casted.brand) && this.colour.equals(colour)) {
				return true;
			}
		} else {
			System.out.println("brand is equal");

		}
		return false;
	}
}
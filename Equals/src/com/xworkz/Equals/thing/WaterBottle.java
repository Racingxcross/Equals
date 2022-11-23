package com.xworkz.Equals.thing;

public class WaterBottle {

	private String brand;
	private String colour;
	private int size;
	private double price;
	private String type;
	private boolean ecofriendly;
	private boolean weight;
	private long mtgdate;
	private long expdate;
	private boolean durability;

	public WaterBottle(String brand, String colour, int size, double price, String type, boolean ecofriendly,
			boolean weight, long mtgdate, long expdate, boolean durability) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.size = size;
		this.price = price;
		this.type = type;
		this.ecofriendly = ecofriendly;
		this.weight = weight;
		this.mtgdate = mtgdate;
		this.expdate = expdate;
		this.durability = durability;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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

	public boolean isDurability() {
		return durability;
	}

	public void setDurability(boolean durability) {
		this.durability = durability;
	}

	@Override
	public String toString() {
		return "WaterBottle [brand=" + brand + ", colour=" + colour + ", size=" + size + ", price=" + price + ", type="
				+ type + ", ecofriendly=" + ecofriendly + ", weight=" + weight + ", mtgdate=" + mtgdate + ", expdate="
				+ expdate + ", durability=" + durability + "]";
	}

	public boolean equals(Object objt) {
		if (objt instanceof WaterBottle) {
			WaterBottle casted = (WaterBottle) objt;
			if (this.brand.equals(casted.getBrand()) && this.colour.equals(colour)) {
				return true;
			}
		} else {
			System.out.println("brand is equal");
		}
		return durability;
		}

	boolean equals1(Object objt) {
		if (this.colour.equals(casted.getcolor()) && this.colour.equals(colour)) {
			return true;
		} else {
			System.out.println("color is equal");
		}
		return false;
	}
}

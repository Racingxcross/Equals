package com.xworkz.Equals.thing;

public class Hospital {

	private String name;
	private String colour;
	private int noOfDoctors;
	private double checkupPrice;
	private String type;
	private boolean treatment;
	private boolean quality;
	private int inaguratedOn;
	private long contactNumber;
	private boolean DayAndNight;

	public Hospital(String name, String colour, int noOfDoctors, double checkupPrice, String type, boolean treatment,
			boolean quality, int inaguratedOn, long contactNumber, boolean dayAndNight) {
		super();
		this.name = name;
		this.colour = colour;
		this.noOfDoctors = noOfDoctors;
		this.checkupPrice = checkupPrice;
		this.type = type;
		this.treatment = treatment;
		this.quality = quality;
		this.inaguratedOn = inaguratedOn;
		this.contactNumber = contactNumber;
		DayAndNight = dayAndNight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNoOfDoctors() {
		return noOfDoctors;
	}

	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

	public double getCheckupPrice() {
		return checkupPrice;
	}

	public void setCheckupPrice(double checkupPrice) {
		this.checkupPrice = checkupPrice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean istreatment() {
		return treatment;
	}

	public void settreatment(boolean treatment) {
		this.treatment = treatment;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public int getInaguratedOn() {
		return inaguratedOn;
	}

	public void setInaguratedOn(int inaguratedOn) {
		this.inaguratedOn = inaguratedOn;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public boolean isDayAndNight() {
		return DayAndNight;
	}

	public void setDayAndNight(boolean dayAndNight) {
		DayAndNight = dayAndNight;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", colour=" + colour + ", noOfDoctors=" + noOfDoctors + ", checkupPrice="
				+ checkupPrice + ", type=" + type + ", treatment=" + treatment + ", quality=" + quality
				+ ", inaguratedOn=" + inaguratedOn + ", contactNumber=" + contactNumber + ", DayAndNight=" + DayAndNight
				+ "]";
	}

	public boolean equals(Object objt) {
		if (objt instanceof Hospital) {
			Hospital casted = (Hospital) objt;
			if (this.type.equals(casted.type) && this.colour.equals(colour)) {
				return true;
			}
		} else {
			System.out.println("Works day and night");

		}
		return false;
	}

}

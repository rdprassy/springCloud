package com.rdprassy.microservices.limitsservice.bean;

public class Limits {
	
	private int minimum;
	public int getMinimum() {
		return minimum;
	}
	public Limits(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public Limits() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	private int maximum;

}

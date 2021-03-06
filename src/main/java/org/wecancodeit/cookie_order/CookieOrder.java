package org.wecancodeit.cookie_order;

public class CookieOrder {
	private String variety;
	private int numBoxes;
	
	// constructor
	public CookieOrder(String variety , int numBoxes) {
		this.variety = variety;
		this.numBoxes = numBoxes;
	}

	// getters (accessor)
	public String getVariety() {
		return variety;
	}
	
	public int getNumBoxes() {
		return numBoxes;
	}
	
	// setters
	public void setVariety(String variety) {
		this.variety = variety;
	}

	public void setNumBoxes(int numBoxes) {
		this.numBoxes = numBoxes;
	}
	
}

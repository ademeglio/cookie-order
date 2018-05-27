package org.wecancodeit.cookie_order;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {

	List<CookieOrder> orders = new ArrayList<>(); 
	
	// add new order
	public void addOrder(CookieOrder cookieOrder) {
		orders.add(cookieOrder);
	}
	
	// get total number of boxes irrespective of variety
	public int getTotalBoxes() { 
		int boxes = 0;
		
		for (CookieOrder order : orders) {
			boxes += order.getNumBoxes();
		}
		return boxes;
	}

	// remove a particular variety of boxes
	public void removeVariety(String variety) {
		for (int i = orders.size() - 1; i >=0; i--) {
			if (orders.get(i).getVariety().equals(variety)) {
				orders.remove(i);
			}
		} 
	} // end removeVariety()
	
	// Traverse and print the ArrayList
	public void showOrder() {
		for (CookieOrder order : orders) {
			System.out.println("Variety: " + order.getVariety() + " " + order.getNumBoxes() + " box(es) ordered.");
		}
	}

	
} // end MasterOrder()

package org.wecancodeit.cookie_order;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {

	List<CookieOrder> orders = new ArrayList<>(); 
	
	public void addOrder(CookieOrder cookieOrder) {
		orders.add(cookieOrder);
	}
	
	public int getTotalBoxes() {
		int boxes = 0;
		
		for (CookieOrder orders : orders) {
			boxes += orders.getNumBoxes();
		}
		return boxes;
	}

	
}

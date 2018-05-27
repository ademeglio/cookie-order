package org.wecancodeit.cookie_order;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MasterOrderTest {
	@Test
	public void shouldReturnTotalBoxesAsOne() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("",1));
		int check = underTest.getTotalBoxes();
		
		assertEquals(1,check);
	}
	
	@Test
	public void shouldReturnTotalBoxesAsTwo() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("",1));
		underTest.addOrder(new CookieOrder("",1));
		int check = underTest.getTotalBoxes();
		
		assertEquals(2, check);
	}
}

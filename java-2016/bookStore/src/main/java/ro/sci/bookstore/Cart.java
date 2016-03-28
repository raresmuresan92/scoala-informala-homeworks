package ro.sci.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	List<CartEntry> newCartEntry = new ArrayList<CartEntry>();
	double totalPrice=0;
	
	public void addCartEntryToCart(CartEntry cartEntry){
		newCartEntry.add(cartEntry);
		cartEntry.adjustStock();
	}
	
	public List<CartEntry> getCart() {
		return newCartEntry;
	}
	public void setCart(List<CartEntry> cart) {
		this.newCartEntry = cart;
	}	

}

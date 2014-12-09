package com.danielsiwiec;

import java.util.HashSet;
import java.util.Set;

public class Stock implements Subject {
	
	private int price;
	Set<StockObserver> observers = new HashSet<>();
	
	public Stock(int price){
		this.price = price;
	}

	@Override
	public void registerObserver(StockObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(StockObserver o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (StockObserver observer : observers){
			observer.update(price);
		}
	}
	
	public void setPrice(int price){
		this.price = price;
		notifyObservers();
	}

}

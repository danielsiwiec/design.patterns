package com.danielsiwiec;

public class BrokerStockObserver implements StockObserver {

	private final String name;
	private final int threshold;

	public BrokerStockObserver(String name, int threshold) {
		this.name = name;
		this.threshold = threshold;
	}

	@Override
	public void update(int price) {
		if (price < threshold) {
			System.out.println(name + ": I'm buying!");
		} else {
			System.out.println(name + ": I'm waiting!");
		}
	}

}

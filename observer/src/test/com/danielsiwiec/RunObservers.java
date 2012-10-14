package com.danielsiwiec;

public class RunObservers {
	
	public static void main(String[] args){
		Stock stock = new Stock(30);
		StockObserver patientObserver = new BrokerStockObserver("Patient Observer", 10);
		StockObserver eagerObserver = new BrokerStockObserver("Eager Observer", 20);
		stock.registerObserver(patientObserver);
		stock.registerObserver(eagerObserver);
		
		System.out.println("Setting price to 30");
		stock.setPrice(30);
		System.out.println("Setting price to 15");
		stock.setPrice(15);
		System.out.println("Setting price to 25");
		stock.setPrice(25);
		System.out.println("Setting price to 5");
		stock.setPrice(5);
	}

}

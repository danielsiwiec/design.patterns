package com.danielsiwiec;

public interface Subject {

	public void registerObserver(StockObserver o);

	public void removeObserver(StockObserver o);

	public void notifyObservers();
}

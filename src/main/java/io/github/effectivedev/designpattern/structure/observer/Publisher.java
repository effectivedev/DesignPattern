package io.github.effectivedev.designpattern.structure.observer;

public interface Publisher {
	
	public void addObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public void publish(String title, String msg);
	
	public void publish(String title, String msg, int level);
}

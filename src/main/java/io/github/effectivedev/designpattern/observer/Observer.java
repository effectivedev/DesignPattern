package io.github.effectivedev.designpattern.observer;

public interface Observer {
	
	public void update(String title, String msg);
	
	public void subscribe(Publisher publisher);
	
	public void unsubscribe(Publisher publisher);
}

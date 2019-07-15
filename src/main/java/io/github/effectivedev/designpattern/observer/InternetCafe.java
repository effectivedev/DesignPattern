package io.github.effectivedev.designpattern.observer;

import java.util.HashSet;
import java.util.Set;

public class InternetCafe implements Publisher {
	String title;
	String msg;

	private static Set<Observer> sets = new HashSet<>();

	@Override
	public void addObserver(Observer observer) {
		sets.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		sets.remove(observer);
	}

	@Override
	public void publish(String title, String msg) {
		for (Observer observer : sets) {
			observer.update(title, msg);
		}
	}

	@Override
	public void publish(String title, String msg, int limitAge) {
		for (Observer observer : sets) {
			if (observer instanceof Person) {
				Person boy = (Person) observer;
				if (limitAge <= boy.getAge()) {
					observer.update(title, msg);
				}
			}
		}
	}
}

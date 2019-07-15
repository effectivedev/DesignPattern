package io.github.effectivedev.designpattern.observer;

public class Person implements Observer {
	private String name;
	private int age;
	
	private Publisher publisher;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public void update(String title, String msg) {
		System.out.println(this+": title: "+ title+ ", msg: " +  msg);
	}
	@Override
	public void subscribe(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.addObserver(this);
	}
	@Override
	public void unsubscribe(Publisher publisher) {
		if(this.publisher != null)
			this.publisher.removeObserver(this);
	}
	@Override
	public String toString() {
		return "Boy [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

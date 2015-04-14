package model;

public class ConcreteObserver02 implements Observer{

	public void update(String state) {
		System.out.println("观察者B的状态为："+state);
		
	}


}

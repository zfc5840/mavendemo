package model;

public class Client {

	 /**
	  * 观察者模式的推模型
	 * @param args
	 */
	public static void main(String[] args) {
		
	        //创建主题对象
	        ConcreteSubject subject = new ConcreteSubject();
	       
	        //创建观察者对象
	        Observer observer = new ConcreteObserver();
	        Observer observer02 = new ConcreteObserver02();
	        //将观察者对象登记到主题对象上
	        subject.attach(observer);
	        subject.attach(observer02);
	        //改变主题对象的状态
	        subject.change("new state");
	    }
}

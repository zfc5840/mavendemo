package com.maven.mavendemo;

public class EqualsDemo {
	private String name;
	
  
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args){
		EqualsDemo equalsDemo = new EqualsDemo();
		equalsDemo.setName("a");
		EqualsDemo equalsDemo2 = new EqualsDemo();
		equalsDemo2.setName("a");
		System.out.println(equalsDemo.hashCode());
		System.out.println(equalsDemo2.hashCode());
		String dd="a";
		String ddd="a";
		if(dd.equals(ddd)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		System.out.println("A".hashCode());
		String c= new String("a");
		String cc=new String("a");
		System.out.println(c.hashCode());
		System.out.println(cc.hashCode());
		if(c.equals(cc)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		if(equalsDemo==equalsDemo2){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		if(equalsDemo.equals(equalsDemo2)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
	}
}

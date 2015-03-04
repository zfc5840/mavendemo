/**
 * Description: HelloWorld.java
 * All Rights Reserved.
 * @version 1.0  2015-3-3 下午4:16:48  by 张富成（fc.zhang@zuche.com）创建
 */
package com.maven.mavendemo;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-3-3 下午4:16:48  by 张富成（fc.zhang@zuche.com）创建
 */
public class HelloWorld {
  public String sayHello(){
	  return "hello world";
  }
  
  public static void main(String[] args){
	  
	  System.out.println(new HelloWorld().sayHello());
  }
}

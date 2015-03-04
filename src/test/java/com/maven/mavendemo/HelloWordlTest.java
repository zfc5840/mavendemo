/**
 * Description: HelloWordlTest.java
 * All Rights Reserved.
 * @version 1.0  2015-3-3 下午4:25:18  by 张富成（fc.zhang@zuche.com）创建
 */
package com.maven.mavendemo;




import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-3-3 下午4:25:18  by 张富成（fc.zhang@zuche.com）创建
 */
public class HelloWordlTest {

	@Test
	public void testSayHello(){
		HelloWorld hw = new HelloWorld();
		String result=hw.sayHello();
		System.out.println(result);
		assertEquals("hello world",result);
	}
}

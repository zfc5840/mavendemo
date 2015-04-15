/**
 * Description: AbstractPayHandler.java
 * All Rights Reserved.
 * @version 1.0  2015-4-15 下午1:23:28  by 张富成（fc.zhang@zuche.com）创建
 */
package abstractDemo;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-15 下午1:23:28  by 张富成（fc.zhang@zuche.com）创建
 */
public abstract class AbstractPayHandler implements IPayHandler{
    
	public void A(){
		System.out.println("A");
		b();
	}
	 protected  abstract void b();
}

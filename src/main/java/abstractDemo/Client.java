/**
 * Description: Client.java
 * All Rights Reserved.
 * @version 1.0  2015-4-15 下午1:27:50  by 张富成（fc.zhang@zuche.com）创建
 */
package abstractDemo;

/**
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015-4-15 下午1:27:50  by 张富成（fc.zhang@zuche.com）创建
 */
public class Client {
    public static void main(String[] args){
    	IPayHandler handler=new CouponPayHandler();
    	handler.A();
    	
    }
}

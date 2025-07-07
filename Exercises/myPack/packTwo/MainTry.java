
package packTwo;
import myPack.Human; //this imports all classes inside of this package
public class MainTry{
public static void main(String[] args){


Human nc = new Human();
nc = null; //this object is no longer visible to the JVM
System.gc(); //i am suggesting that jvm runs garbage collection

Human h1 = new Human();
//System.out.println(h1.opener);
System.out.println(h1.closer);
//System.out.println(h1.left);
//System.out.println(h1.right);
}
}
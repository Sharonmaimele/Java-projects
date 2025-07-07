public class Addition{

public static void main(String[] args){

byte e = -128;
e = (byte)(e-1); //wraps to positive value
System.out.println(e);

byte f = 127;
f =(byte)(f+1);  //wraps to a negative value;
System.out.println(f);




int a = 4;
int b = 5;
String c = "Hello";
String d = "Room 6";
//System.out.println(a++);  //post affect in memory not immediately
//System.out.println(++a);  //pre changes immediately
//System.out.println(b++);
//System.out.println(++b);
System.out.println(a>b);   //relational operators
System.out.println(b<a);
System.out.println(a==b);
System.out.println(b>a);
System.out.println(a>b || a==b);  //logical operators


}
}
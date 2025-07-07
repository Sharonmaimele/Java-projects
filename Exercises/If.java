
public class If{

public static void main(String[] args){
StringBuilder sb = new StringBuilder("Hello");
sb.append("World");
System.out.println(sb); //output Hello World

sb.insert(5, " Java");
System.out.println(sb); //output Hello Java

sb.delete(5, 10);
System.out.println(sb); //output Hello

sb.deleteCharAt(1);
System.out.println(sb); //output: Hllo

sb.reverse();
System.out.println(sb); //output: olleH

/*
String x = "FMTALI";
String x = "FMTALI".concat( "Group").contains("AL"); //error because we included a boolean statement(contains) in a String
x = x+1; //anything that comes after the string value is a string
System.out.println(x);

String s1 = "Ice";
String s2 = "Ice";
String s3 = "Cream";
System.out.println(s1.compareTo(s2)); //output 0 s1 == s2
System.out.println(s1.compareTo(s3)); //positive 6 s1 < s3
System.out.println(s3.compareTo(s1)); //negative -6 s3 >


int a = 4;
int b = 5;
option a
int max;
if(a>b){
max = a;
}else{max = b;
}
System.out.println(max);

option b
int max = (a>b)? a:b;
System.out.println(max); //this is a tenary operator
*/










/*another example of tenary operator
int score = 72;
String grade = (score>=90) ? "A"
             : (score>=80) ? "B"
             :(score>=70) ? "C"
             :(score>=60) ? "D"
             :"F";
System.out.println("Grade: " + grade); 
*/
/*
boolean x = true;
if(x){ //this evaluates to true
  if(b<a){
System.out.println("This is right answer");
}
else if(b>a){
System.out.println("This is wrong answer");
}
else{
System.out.println("You are welcome");
}
}
else{
System.out.println("Not sure of my answer");
}*/
}
}
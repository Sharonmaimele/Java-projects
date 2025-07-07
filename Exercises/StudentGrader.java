
//import java.util.Scanner;
import java.time.*;
import java.time.format.*;
import java.util.*;
public class StudentGrader{

public static void main(String[] args){

DateTimeFormatter x = DateTimeFormatter.ofPattern("MM dd yyyy");
LocalDate y = LocalDate.parse("05 22 2025", x);
System.out.println(y);

/*
    Scanner sc = new Scanner(System.in); 
    int examScore = Integer.parseInt(sc.nextLine());
    int finalScore = 0;
    if(examScore >= 40){
    finalScore = examScore + 5;
}else{
finalScore = examScore - 2;

}
    if(finalScore >= 50){
     
}
*/
}
}
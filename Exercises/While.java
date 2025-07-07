
/*public class While{

public static void main(String[] args){
final float initialValue = 2.34F;
final float step = 0.11F;
final float limit = 4.69F;
float var = initialValue;
int counter = 0;

do{
System.out.println("Counter value:" + counter);
counter++;
}while(var= =limit);
}
}*/  


//For loop
public class While{

public static void main(String[] args){
final float initialValue = 2.34F;
final float step = 0.11F;
final float limit = 4.69F;
int counter = 0;

for(float var = initialValue;var==limit;var +=step)
counter++; 
System.out.println("Counter value: " + counter);
}
}


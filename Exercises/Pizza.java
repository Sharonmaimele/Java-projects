
public class Pizza{

String size;
int slices;

//Simple Constructor
public Pizza(){
System.out.println("I am creating a pizza");
size = "Medium";
slices = 8;
}

public void displayInfo(){
System.out.println("Size: is" + "  " + size);
System.out.println("Slices: " + slices);
}
public static void main(String[] args){
new Pizza().displayInfo();
//Pizza p1 = new Pizza();
//p1.displayInfo();
}

}
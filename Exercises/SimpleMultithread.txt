///09.06.2025

class SimpleThread extends Thread{
 private String threadName;

 public SimpleThread(String name){
  this.threadName = name;
}

public void run() {
 for (int i = 1; i<=5;i++){
  System.out.println(threadName + "is running:" + i);
  try{
    Thread.sleep(500); //wait for 0.5 seconds
    } catch (InterruptedException e){
    System.out.println(threadName + "was interruted.");
       }
     }
   }
} 

public class SimpleMultithread{
 public static void main(String[] args) {
   SimpleThread t1 = new SimpleThread ("Thread A");
   SimpleThread t2 = new SimpleThread ("Thread B");

   t1.start();
   t2.start();
   System.out.println("Main method finished!");
 }
}

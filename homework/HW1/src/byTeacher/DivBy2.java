package byTeacher;

public class DivBy2 extends Thread{
   public void run(){

       int i = 0;

       while (true){

           System.out.println(i + " is even");

           i+=2;

           try {
               sleep(100);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
   }
}

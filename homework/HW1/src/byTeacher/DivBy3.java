package byTeacher;

import static java.lang.Thread.sleep;

public class DivBy3 implements Runnable{

    public void run(){

        int i = 0;

        while (true){

            System.out.println(i + " is devided by 3");

            i+=3;

            try {
               sleep(100);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
   }
}

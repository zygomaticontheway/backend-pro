import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.max;
import static java.lang.Math.min;
public class TreyeTech {
    public static void main(String[] args) {
        TreyeTech ();
    }

    public static void TreyeTech (){
        int[] a = {111, 114, 109, 104, 97, 97, 115, 97, 77, 119, 108};
        boolean ok = true;
        int c = 0;

        for (int i = 0; i < a.length; i++){
            if (i == 0) {
                c = 8 % a.length;
//                System.out.println("c = 8 % " + a.length + " = " + c);
            } else if (i % 2 == 0 && i < 8) {
                c = i -1;
                ok = true;
            } else if (i == 1) {
                c = i + 6;
            } else if (i % 2 == 1) {
                c = (i == 3 || i == 7 )? (i + 3) : (i - 3);

                ok = ok || !ok; // may be here is a mistake? It's always true

                while (!ok){ // condition is always false, we'll never Sleep
                    System.out.println("Sleep");
                }
            }
            if (i / 100 + i % 100 > 100 * i) { //it's also has no sense
                break;
            }
            System.out.print((char)a[c]);
        }
        System.out.print((char)a[min(7,8)]);
        System.out.print((char)a[max(0,9)]);
    }
}

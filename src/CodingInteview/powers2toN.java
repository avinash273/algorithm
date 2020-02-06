package CodingInteview;

import java.lang.Math;
public class powers2toN {
    //Line 1 2 4 8 16...
    void getPowers2toN(int n){
        if (n < 0)
            System.out.println("0");
        else{
            for (int i = 0; i <= n; i++) {
                System.out.println("2^" + i + " = " + Math.pow(2, i));
            }
        }

    }
}

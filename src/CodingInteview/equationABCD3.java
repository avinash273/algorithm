package CodingInteview;

public class equationABCD3 {
    //O(n4)
    void getAB_CB3(int n){
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                for (int c = 1; c < n; c++) {
                    for (int d = 1; d < n; d++) {
                        if ( (a*a*a) + (b*b*b) == (c*c*c) + (d*d*d) )
                            System.out.println("a3+b3 == c3+d3: "+" a "+a+" b "+b+" == c "+c+" d "+d);
                        break;
                    }
                }
            }
        }
    }
}

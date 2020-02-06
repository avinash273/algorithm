package recursion;

public class GCD {
    int getGCD(int a,int b){
        if (b == 0)
            return a;
        return getGCD(b, a%b);
    }
}

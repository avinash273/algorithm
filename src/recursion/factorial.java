package recursion;

public class factorial {
    double getFactorial(double n){
        if (n == 0) return 1;
        else if (n < 0) return 0;
        return n * getFactorial(n-1);
    }
}

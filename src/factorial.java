public class factorial {
    //O(n)
    int getFactorial(int n) {
        if (n < 0)
            return -1;
        else if (n == 0)
            return 1;
        else
            return n * getFactorial(n - 1);
    }
}

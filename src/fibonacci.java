public class fibonacci {
    int getFibonacci(int n){
        if(n <= 0)
            return 0;
        else if(n == 1)
            return 1;
        return getFibonacci(n-1) + getFibonacci(n-2);
    }

    void allFib(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(i + ":" + getFibonacci(i));
        }
    }
}

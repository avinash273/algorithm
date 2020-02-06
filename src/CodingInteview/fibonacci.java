package CodingInteview;

public class fibonacci {
    //O(2^n)
    int getFibonacci(int n) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    //O(n)
    int getFibOptimised(int n, int[] memo) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (memo[n] > 0)
            return memo[n];

        memo[n] = getFibOptimised(n -1, memo) + getFibOptimised(n - 2, memo);
        return memo[n];
    }

    void allFib(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + ":" + getFibonacci(i));
        }
    }

    void allFibOpti(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(i + ":" + getFibOptimised(i, memo));
        }
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("\nThis is main class is used to call all other program classes!");

        /*
        //tester
        tester tester = new tester();
        tester.test();
         */


        //Code to find a number is prime or not
        isPrime isPrime = new isPrime();
        System.out.println("Raw Prime algo: " + isPrime.check_prime(17));
        System.out.println("Optimised Prime algo: " + isPrime.check_prime(17));

        System.out.println("\n");

        //code for factorial Recursive
        factorial factorial = new factorial();
        System.out.println("Recursive Factorial: " + factorial.getFactorial(5));

        //All permutations of a string
        stringPermutations stringPermutations = new stringPermutations();
        System.out.println("\nAll permutations of a string");
        stringPermutations.getPermutations("abc", "");

        //All fibonacci from 0 to n
        fibonacci fibonacci = new fibonacci();
        System.out.println("\nAll fibonacci from 0 to n");
        fibonacci.allFib(10);
        //optimised using cache
        System.out.println("\nCache fibonacci from 0 to n");
        fibonacci.allFibOpti(10);
    }
}

public class main {
    public static void main(String[] args){
        System.out.println("\nThis is main class is used to call all other program classes!");

        System.out.println("\n");

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
        stringPermutations.getPermutations1("abcd");
    }
}

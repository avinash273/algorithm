package CodingInteview;

public class main {
    public static void main(String[] args) {
        System.out.println("\n***This is CodingInteview.main class is used to call all other program classes!***\n");

        //CodingInteview.tester
        //CodingInteview.tester CodingInteview.tester = new CodingInteview.tester();
        //CodingInteview.tester.test();


        //Code to find a number is prime or not
        //CodingInteview.isPrime CodingInteview.isPrime = new CodingInteview.isPrime();
        //System.out.println("Raw Prime algo: " + CodingInteview.isPrime.check_prime(17));
        //System.out.println("Optimised Prime algo: " + CodingInteview.isPrime.check_prime(17));

        //System.out.println("\n");

        //code for CodingInteview.factorial Recursive
        //CodingInteview.factorial CodingInteview.factorial = new CodingInteview.factorial();
        //System.out.println("Recursive Factorial: " + CodingInteview.factorial.getFactorial(5));

        //All permutations of a string
        //CodingInteview.stringPermutations CodingInteview.stringPermutations = new CodingInteview.stringPermutations();
        //System.out.println("\nAll permutations of a string");
        //CodingInteview.stringPermutations.getPermutations("abc", "");

        //All CodingInteview.fibonacci from 0 to n
        //CodingInteview.fibonacci CodingInteview.fibonacci = new CodingInteview.fibonacci();
        //System.out.println("\nAll CodingInteview.fibonacci from 0 to n");
        //CodingInteview.fibonacci.allFib(10);
        //optimised using cache
        //System.out.println("\nCache CodingInteview.fibonacci from 0 to n");
        //CodingInteview.fibonacci.allFibOpti(10);

        //Product without * operator
        //CodingInteview.product CodingInteview.product = new CodingInteview.product();
        //CodingInteview.product.productNoMultiply(5,4);

        //2^n to n number
        //CodingInteview.powers2toN CodingInteview.powers2toN = new CodingInteview.powers2toN();
        //CodingInteview.powers2toN.getPowers2toN(5);

        //a3+b3 == c3+d3
        //CodingInteview.equationABCD3 CodingInteview.equationABCD3 = new CodingInteview.equationABCD3();
        //CodingInteview.equationABCD3.getAB_CB3(6);

        //unique string with each char only once
        //CodingInteview.uniqueChar CodingInteview.uniqueChar = new CodingInteview.uniqueChar();
        //CodingInteview.uniqueChar.checkUniqueChar("abcdefgh");


        //Compare str2 to permutations of str1
        //CodingInteview.compStrPermutation CodingInteview.compStrPermutation = new CodingInteview.compStrPermutation();
        //CodingInteview.compStrPermutation.checkStringPermutation("abc","cb");

        //CodingInteview.Sorting Algorithms
        Sorting Sorting = new Sorting();
        int inputarr[] = {9, 8, 7, 6, 5};
        Sorting.bubble_sort_algo(inputarr);
        Sorting.selection_sort(inputarr);
        Sorting.insertion_sort(inputarr);

        //CodingInteview.Searching Algos
        Searching Searching = new Searching();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int val = Searching.Binary_Search(arr, 1);
        System.out.println("\nBinary Search Index: " + val);

    }
}

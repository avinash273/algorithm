package recursion;

import java.util.Arrays;

public class recursion_main {
    public static void main(String[] args){
        GCD GCD = new GCD();
        System.out.println(GCD.getGCD(30,250));
        factorial factorial = new factorial();
        System.out.println(factorial.getFactorial(10));

        mergesort sorter = new mergesort();
        int[] data = {4,1,6,-9,5};
        sorter.sort(data);
        System.out.println("Merge Sort: "+Arrays.toString(data));
        System.out.println(data);

        QuickSort Quicksort = new QuickSort();
        Quicksort.qsort(data);
        System.out.println("Quick Sort: "+Arrays.toString(data));
    }
}

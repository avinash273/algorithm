package CodingInteview;

public class Sorting {
    void bubble_sort_algo(int[] array) {
        System.out.print("CodingInteview.Sorting\nBefore: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        for (int i = 0; i < array.length - 1; i++) {
            int temp;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        System.out.print("\nAfter Bubble : ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    void selection_sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 2; i++) {
            int minindex = i;
            for (int j = i + 1; j < array.length - 2; j++) {
                if (array[minindex] > array[j])
                    minindex = j;
            }
            temp = array[minindex];
            array[minindex] = array[i];
            array[i] = temp;
        }
        System.out.print("\nAfter Selection : ");
        for (int value : array) {
            System.out.print(value + " ");
        }

    }

    //Stable sort
    void insertion_sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        System.out.print("\nAfter Insertion : ");
        for (int value : array) {
            System.out.print(value + " ");
        }


    }
}

public class BubbleSort {
    void bubble_sort_algo(int[] array){
        System.out.print("Bubble Sorting\nBefore: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        for (int i = 0; i < array.length-1; i++) {
            int temp;
            for (int j = 0; j < array.length-1-i ; j++) {
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
        System.out.print("\nAfter : ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

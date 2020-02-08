package recursion;


import java.util.Arrays;

public class CountingSorter {
    void sort(int[] data){
        int[] temp = new int[11];

        for (int i = 0; i <data.length ; i++) {
            temp[data[i]] = temp[data[i]] + 1;
        }

        int curr = 0;
        for (int i = 0; i <temp.length ; i++) {
            if (temp[i] != 0){
                for (int j = 0; j < temp[i] ; j++) {
                    data[curr] = i;
                    curr++;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] data = new int[] {9,8,7,6,5,4,3,2,1,0,10};
        System.out.println("Before Counting Sort: "+Arrays.toString(data));
        //Integer[] data = new Integer[] { 3, 10, 2, 4, 2, 6, 9, 5, 7, 2, 8, 10, 3, 9 };
        CountingSorter CountingSorter = new CountingSorter();
        CountingSorter.sort(data);
        System.out.println("After Counting Sort: "+Arrays.toString(data));
    }
}


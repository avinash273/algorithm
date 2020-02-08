package recursion;

public class QuickSort {

    public void qsort(int[] data) {
        QuickSortAlgo(data, 0, data.length - 1);
    }

    void QuickSortAlgo(int[] data, int start, int end) {
        if (start < end) {
            int piviotIndex = Partition(data, start, end);
            QuickSortAlgo(data, start, piviotIndex - 1);
            QuickSortAlgo(data, piviotIndex + 1, end);
        }
    }

    int Partition(int[] data, int start, int end) {
        int piviot = data[end];
        int temp = 0;
        int i = start;
        for (int j = start; j <= end - 1; j++) {
            if (data[j] < piviot) {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
            }
        }
        data[end] = data[i];
        data[i] = piviot;
        return i;
    }

}

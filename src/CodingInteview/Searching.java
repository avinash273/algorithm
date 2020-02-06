package CodingInteview;

import java.lang.Math;

public class Searching {
    int Binary_Search(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = high + low;
            mid = Math.floorDiv(mid, 2);
            if (arr[mid] < x)
                low = mid + 1;
            else if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] == x)
                return mid;
        }
        return -1;
    }
}

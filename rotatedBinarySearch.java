import java.util.*;

public class rotatedBinarySearch {
    public static int indexNo(int nums[], int key) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == key) return mid;

            // Left half is sorted
            if (nums[start] <= nums[mid]) {
                if (key >= nums[start] && key < nums[mid]) {
                    end = mid - 1;      // go left
                } else {
                    start = mid + 1;    // go right
                }
            } 
            // Right half is sorted
            else {
                if (key > nums[mid] && key <= nums[end]) {
                    start = mid + 1;    // go right
                } else {
                    end = mid - 1;      // go left
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 8, 0, 1};
        int key = 1;
        System.out.println("Index is: " + indexNo(nums, key));
    }
}

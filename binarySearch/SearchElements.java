import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 5, 90, 67, 45, 89, 67, 123};
        Arrays.sort(arr); 
        int target = 67;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                System.out.println("We reached Target value is: --> " + target);
                return;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}

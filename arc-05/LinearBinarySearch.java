
public class LinearBinarySearch {

    public static void main(String[] args) {
        int nums[] = {5, 7, 9, 11, 13};

        int target = 7;
        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target, 0, nums.length - 1);
        if (result1 != -1) {
            System.err.println("Element found at : " + result1); 
        }else {
            System.out.println("Element not found");
        }
        if (result2 != -1) {
            System.err.println("Element found at : " + result2); 
        }else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {

        if (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, right); 
            }else {
                return binarySearch(nums, target, left, mid - 1);
            }
        }

        // int left = 0;
        // int right = nums.length-1;
        // while(left <= right){
        //     int mid = (left+right)/2;
        //     if(nums[mid] == target) return mid;
        //     if(nums[mid] < target) left = mid + 1;
        //     else right = mid - 1; 
        // }
        return -1;
    }
}

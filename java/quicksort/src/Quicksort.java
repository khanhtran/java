import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        print(sortArray(new int[] {-1,2,-8,-10}));
    }

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void print(int[] arr, int l, int h) {        
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, l, h + 1)));
    }

    public static int[] sortArray(int[] nums) {
        return quicksort(nums, 0, nums.length - 1);
    }

    private static int[] quicksort(int[] nums, int l, int h) {
        if (l >= h) {
            return nums;
        }
        System.out.println("----");
        System.out.println("l = " + l + ", h = " + h);
        print(nums, l, h);
        int j = partition(nums, l, h);
        System.out.println("pivot = " + j);
        System.out.println("partition: ");
        print(nums, l, h);
        quicksort(nums, l, j-1);
        quicksort(nums, j + 1, h);
        return nums;
    }

    private static int partition(int[] nums, int l, int h) {
        int pivot = h;
        int j = l;

        for (int i = l; i <= h; i++) {
            if (nums[i] < nums[pivot]) {
                swap(nums, j, i);
                j++;
            }
        }
        
        swap(nums, j, pivot);
        return j;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

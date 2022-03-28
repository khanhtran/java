public class Binary {
    public static void main(String[] args) {

        int[] arr = new int[] {1, 3, 7, 15, 19, 22, 25};

        int l = 0;
        int r = arr.length;
        int key = 2;
        while (l < r) {
            int mid = l + (r - l)/2;
            if (key <= arr[mid]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        System.out.println("l: " + l);
    }
}

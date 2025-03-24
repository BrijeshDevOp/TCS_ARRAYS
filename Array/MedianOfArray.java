import java.util.Arrays;

class MedianOfArray {

    static int median(int n) {
        if (n % 2 == 0) {
            return (((n / 2) + (n - 1) / 2) / 2);
        } else {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 7, 3, 19, 25, 15, 10, 8, 5, 21, 30, 18, 6, 2, 14, 27, 9, 4, 16, 11 };

        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(arr[median(n)]);
    }
}
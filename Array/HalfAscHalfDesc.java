import java.util.Arrays;

public class HalfAscHalfDesc {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 8, 9, 10, 4, 5, 6, 7, };

        for (int i : arr) {
            System.out.print(" " + i);
        }

        Arrays.sort(arr);
        System.err.println();
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(" " + arr[i]);
        }

        for (int i = arr.length - 1; i > arr.length / 2; i--) {
            System.out.print(" " + arr[i]);
        }
    }

}

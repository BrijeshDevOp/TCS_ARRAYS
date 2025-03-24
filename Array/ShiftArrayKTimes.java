import java.util.Arrays;

class ShiftArrayKTimes {

    static void leftShift(int arr[], int n, int k) {
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }

        System.out.println(Arrays.toString(temp));
    }

    static void rightShift(int arr[], int n, int k) {
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 3;

        leftShift(arr, arr.length, k);
        rightShift(arr, arr.length, k);

    }
}
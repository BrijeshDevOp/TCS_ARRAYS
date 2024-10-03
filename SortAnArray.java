public class SortAnArray {
    public static void main(String[] args) {
        System.out.println(" Soring");

        int arr[] = { 2, 4, 53, 2, 1, 4, -2, 0 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }
    }
}

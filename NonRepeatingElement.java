public class NonRepeatingElement {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 2, 4, 1, 1, 9 };
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count = count + 1;
                }
            }

            if (count == 0)
                System.out.println("Non repeating element " + arr[i]);
        }
    }
}

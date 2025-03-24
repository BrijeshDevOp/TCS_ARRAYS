import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        n = sc.nextInt();
        int arr[] = new int[n];
        int len = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
        System.out.println(" After \n");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }

        sc.close();
    }
}

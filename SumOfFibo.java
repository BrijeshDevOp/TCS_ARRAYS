public class SumOfFibo {

    static int sum(int n) {
        int arr[] = new int[n];
        if (n < 1)
            return 0;
        else {

            arr[0] = 0;
            arr[1] = 1;
            System.out.println(arr[0]+"\n"+arr[1]);
            int sum = arr[0] + arr[1];
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
                System.out.println(arr[i]);
                sum += arr[i];
            }

            return sum;
        }

    }

    public static void main(String[] args) {
        System.out.println("sum of fibonacci is " + sum(10));
    }
}
public class SecondLargestAndSmallest {

    static void secondMaxMin(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }

        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            // Finding first and second max
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }

            // Finding first and second min
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE || secondMin == Integer.MAX_VALUE) {
            System.out.println("No valid second max or second min found");
        } else {
            System.out.println("Second Max is " + secondMax + ", Second Min is " + secondMin);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        secondMaxMin(arr);
    }
}
import java.util.ArrayList;
import java.util.Arrays;

public class UpadtingArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        for (Integer integer : list) {
            System.out.print(" " + integer);
        }

        list.add(0, 33);
        list.add(55);
        list.add(3, 33);
        System.out.println(list);
    }
}

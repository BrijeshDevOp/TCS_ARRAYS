import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveRepeatedElements {

    static List<Integer> removeDuplicate(int arr[]) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 4, 2, 1, 5, 6, 3 };s

        List<Integer> list = removeDuplicate(arr);
        System.out.println(list);
    }
}

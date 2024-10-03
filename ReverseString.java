public class ReverseString {
    public static void main(String[] args) {
        String a = "BrijeshJ";
        int left = 0;
        char c[] = a.toCharArray();
        int right = c.length - 1;
        while (left < right) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right--;
        }
        System.out.println(new String(c));

    }
}

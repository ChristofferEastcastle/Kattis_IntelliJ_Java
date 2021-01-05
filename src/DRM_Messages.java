import java.util.ArrayList;
import java.util.Scanner;

public class DRM_Messages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        ArrayList<Character> first = new ArrayList<>();
        ArrayList<Character> second = new ArrayList<>();
        int a = 0;
        int b = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (i < length / 2) {
                a += arr[i] % 65;
            }
            else
                b += arr[i] % 65;
        }
        for (int i = 0; i < length; i++) {
            if (i < length / 2) {
                arr[i] += a;
                while (arr[i] > 90)
                    arr[i] -= 26;
                first.add(arr[i]);
            } else {
                arr[i] += b;
                while (arr[i] > 90)
                    arr[i] -= 26;
                second.add(arr[i]);
            }
        }
        for (int i = 0; i < first.size(); i++) {
            int c = first.get(i) + (second.get(i) % 65);
            if (c > 90 * 2)
                c = c % 65 + 65;
            while (c > 90)
                c -= 26;
            System.out.print((char) c);

        }
    }
}

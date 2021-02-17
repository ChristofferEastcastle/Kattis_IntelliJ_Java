import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Character> chars2 = new ArrayList<>();

        for (int i = 0; i < 3; i++)
            ints.add(sc.nextInt());
        sc.nextLine(); //Fix input stream

        char[] str = sc.nextLine().toCharArray();
        for (char c : str) {
            chars.add(c);
            chars2.add(c);
        }
        int[] arr = new int[3];

        Collections.sort(chars2);
        Collections.sort(ints);

        for (int i = 0; i < 3; i++){
            int index = chars.indexOf(chars2.get(i));
            arr[index] = ints.get(i);
        }

        System.out.printf("%d %d %d", arr[0], arr[1], arr[2]);
    }
}

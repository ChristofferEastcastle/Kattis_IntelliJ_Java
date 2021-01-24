import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Synchronizing_Lists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            ArrayList<Integer> first = new ArrayList<>();
            ArrayList<Integer> new_first = new ArrayList<>();
            ArrayList<Integer> second = new ArrayList<>();
            int[] arr = new int[n];
            for (int i = 0; i < n * 2; i++) {
                if (i < n) {
                    int a = sc.nextInt();
                    first.add(a);
                    new_first.add(a);

                }else
                    second.add(sc.nextInt());
            }

            Collections.sort(new_first);
            Collections.sort(second);
            for (int i = 0; i < n; i++) {
                int index = first.indexOf(new_first.get(i));
                arr[index] = second.get(i);
            }
            for (int i : arr)
                System.out.println(i);
            System.out.println();
            n = sc.nextInt();
        }
    }
}

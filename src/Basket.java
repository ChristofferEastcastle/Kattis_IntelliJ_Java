import java.util.ArrayList;
import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();

        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0)
                chars.add(input[i]);
            else
                scores.add(Integer.parseInt(String.valueOf(Character.valueOf(input[i]))));
        }

        int a_total = 0;
        int b_total = 0;
        for (int i = 0; i < chars.size(); i++) {
            if (chars.get(i) == 'A')
                a_total += scores.get(i);
            else
                b_total += scores.get(i);
        }

        if (a_total > b_total)
            System.out.println('A');
        else
            System.out.println('B');
    }
}

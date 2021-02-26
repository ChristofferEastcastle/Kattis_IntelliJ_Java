import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        ArrayList<Character> word = new ArrayList<>();
        for (char c : input)
            word.add(c);

        int counter = 0;
        char[] permutation = sc.nextLine().toCharArray();
        for (char c : permutation){
            if (word.isEmpty())
                break;
            if (word.contains(c))
                word.removeAll(Collections.singleton(c));
            else
                counter++;
        }
        if (counter >= 10)
            System.out.println("LOSE");
        else
            System.out.println("WIN");
    }
}

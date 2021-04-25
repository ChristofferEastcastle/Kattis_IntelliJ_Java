import java.util.*;

public class Kleptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[] last_n_plain = sc.nextLine().toCharArray();
        char[] b = sc.nextLine().toCharArray();

        ArrayList<Character> plainText = new ArrayList<>();
        ArrayList<Character> cipherText = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if (i <= last_n_plain.length - 1)
                plainText.add(last_n_plain[i]);
            cipherText.add(b[i]);
        }
        Collections.reverse(plainText);
        Collections.reverse(cipherText);
        ArrayList<Character> key_list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            char c = (char) (cipherText.get(i) - plainText.get(i) % 97);
            c = checkIfInRange(c);
            key_list.add(c);
        }
        for (int i = n; i < m - 1; i++){
            char c = (char) (cipherText.get(i) - key_list.get(i - n) % 97);
            c = checkIfInRange(c);
            key_list.add(c);
        }
        plainText.addAll(key_list);

        for (int i = m - 1; i >= 0; i--) {
            System.out.print(plainText.get(i));
        }
    }

    private static char checkIfInRange(char c) {
        if (c < 97)
            c += 26;
        if (c > 122)
            c -= 26;
        return c;
    }
}

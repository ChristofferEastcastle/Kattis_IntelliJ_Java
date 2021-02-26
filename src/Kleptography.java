import java.util.*;

public class Kleptography {
    public static void main(String[] args) {
        char[] arr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> alphabet = new ArrayList<>();
        for (char c : arr)
            alphabet.add(c);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[] last_n_plain = sc.nextLine().toCharArray();

        char[] b = sc.nextLine().toCharArray();
        ArrayList<Character> last = new ArrayList<>();
        ArrayList<Character> cipherText = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if (i <= last_n_plain.length - 1)
                last.add(last_n_plain[i]);
            cipherText.add(b[i]);
        }
        Collections.reverse(last);
        Collections.reverse(cipherText);
        ArrayList<Character> key_list = new ArrayList<>();

        char[] key = new char[b.length];
        for (int i = 0; i < n; i++){
            key_list.add((char) (cipherText.get(i) - last.get(i) % 97));
        }
        System.out.println(last);
        System.out.println(cipherText);
        System.out.println(key_list);
    }
}

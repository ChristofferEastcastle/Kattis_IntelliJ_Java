import java.util.Scanner;

public class Kemija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        char[] wowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < arr.length; i++) {
            for (char c : wowels) {
                if (arr[i] == c) {
                    i += 2;
                    break;
                }
            }
            System.out.printf("%c", arr[i]);
        }
    }
}
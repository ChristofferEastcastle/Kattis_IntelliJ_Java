import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'e')
                c++;
        }
        c *= 2;
        String str = "h";
        for (int i = 0; i < c; i++) {
            str += 'e';
        }
        str += 'y';
        System.out.println(str);
    }
}

import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        String a_reversed = "";
        String b_reversed = "";

        for (int i = b.length - 1; i >= 0; i--) {
            a_reversed += a[i];
            b_reversed += b[i];
        }
        Integer new_a_parsed = Integer.parseInt(a_reversed);
        Integer new_b_parsed = Integer.parseInt(b_reversed);
        if (new_a_parsed > new_b_parsed)
            System.out.println(new_a_parsed);
        else
            System.out.println(new_b_parsed);
    }
}

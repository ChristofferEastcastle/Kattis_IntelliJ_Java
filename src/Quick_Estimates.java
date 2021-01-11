import java.util.Scanner;

public class Quick_Estimates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char[] arr = sc.next().toCharArray();
            System.out.println(arr.length);
        }
    }
}

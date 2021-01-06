import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt();
        int b = 0;
        while (Math.ceil((double) b / a) != i)
            b += 1;
        System.out.println(b);
    }
}

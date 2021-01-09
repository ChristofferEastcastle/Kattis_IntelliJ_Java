import java.util.Scanner;

public class Harshad_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n % sumOf(n) != 0)
            n++;
        System.out.println(n);
    }
    public static int sumOf (Integer input) {
        String[] arr = input.toString().split("");
        int sum = 0;
        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}

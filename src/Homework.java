import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split(";");

        int total = 0;

        for (String str : arr)
            if (str.contains("-")) {
                int a = Integer.parseInt(str.split("-")[0]);
                int b = Integer.parseInt(str.split("-")[1]);
                for (int i = a; i <= b; i++) {
                    total++;
                }
            } else {
                total++;
            }
        System.out.println(total);
    }
}

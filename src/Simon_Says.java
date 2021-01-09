import java.util.Scanner;

public class Simon_Says {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            String s = sc.nextLine();
            if (s.contains("Simon says")) {
                int index = s.indexOf("says");
                System.out.println(s.substring(index + 5));
            }
        }
    }
}

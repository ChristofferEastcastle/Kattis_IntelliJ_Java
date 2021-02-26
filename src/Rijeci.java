import java.util.Scanner;

public class Rijeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        String mainString = "A";

        String newString = "A";
        String current = "A";
        int a = 1, b = 0;

        for (int i = 0; i < k; i++){
            if (current.equals("A")){
                current.replaceAll("A", "B");
                current = "B";

            }
            else if (current.equals("B")){
                b++;
                mainString.replaceAll("B", "BA");
                current = "A";
                a++; b++;
            }

        }
        System.out.printf("%d %d", a, b);
    }
}

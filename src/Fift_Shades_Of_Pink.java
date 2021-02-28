import java.util.Scanner;

public class Fift_Shades_Of_Pink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine().toUpperCase();
            if ((str.contains("ROSE")) || (str.contains("PINK"))){
                count++;
            }
        }
        if (count == 0)
            System.out.println("I must watch Star Wars with my daughter");
        else
            System.out.println(count);
    }
}

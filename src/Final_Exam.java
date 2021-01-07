import java.util.ArrayList;
import java.util.Scanner;

public class Final_Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> an = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            list.add(str);
        }
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i).equalsIgnoreCase(list.get(i + 1)))
                c++;
        }
        System.out.println(c);
    }
}

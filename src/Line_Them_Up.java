import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Line_Them_Up {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input.add(sc.nextLine());
        }
        ArrayList<String> decreasing = new ArrayList<>(input);
        Collections.sort(decreasing);
        Collections.reverse(decreasing);
        ArrayList<String> increasing = new ArrayList<>(input);
        Collections.sort(increasing);
        if (input.equals(decreasing))
            System.out.println("DECREASING");
        else if (input.equals(increasing))
            System.out.println("INCREASING");
        else
            System.out.println("NEITHER");
    }
}
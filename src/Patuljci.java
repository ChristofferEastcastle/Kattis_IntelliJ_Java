import java.util.ArrayList;
import java.util.Scanner;

public class Patuljci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            list.add(num);
            sum += num;
        }
        int difference = sum - 100;

        loop:
        for (Integer a : list){
            for (Integer b : list){
                if (a + b == difference){
                    list.remove(a);
                    list.remove(b);
                    break loop;
                }
            }
        }
        for (int c : list)
            System.out.println(c);
    }
}
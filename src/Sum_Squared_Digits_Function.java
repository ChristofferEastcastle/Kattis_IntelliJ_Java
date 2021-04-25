import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sum_Squared_Digits_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int base = sc.nextInt();
            int number = sc.nextInt();
            System.out.println(k + " " + SSD((ConvertToDecimal(base, number))));
        }
    }

    private static int SSD(ArrayList<Integer> list){
        int total = 0;
        for (int num : list){
            total += Math.pow(num, 2);
        }
        return total;
    }

    private static ArrayList<Integer> ConvertToDecimal(int base, int n){
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0){
            int remainder = n % base;
            n /= base;
            list.add(remainder);
        }
        Collections.reverse(list);
        return list;
    }
}
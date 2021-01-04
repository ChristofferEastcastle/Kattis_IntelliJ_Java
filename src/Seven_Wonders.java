import java.util.ArrayList;
import java.util.Scanner;

public class Seven_Wonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int t = 0;
        int c = 0;
        int g = 0;
        int sets = 0;
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            switch (arr[i]) {
                case 'T':
                    t++;
                    break;
                case 'C':
                    c++;
                    break;
                case 'G':
                    g++;
                    break;
                default:
                    break;
            }
            if(list.contains('T') && list.contains('C') && list.contains('G')) {
                list.remove(list.indexOf('T'));
                list.remove(list.indexOf('C'));
                list.remove(list.indexOf('G'));
                sets += 1 * 7;
            }
        }
        double sum = Math.pow(t, 2) + Math.pow(c, 2) + Math.pow(g, 2) + sets;
        System.out.println((int) sum);
    }

}

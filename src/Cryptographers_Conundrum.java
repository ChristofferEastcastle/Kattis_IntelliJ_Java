import java.util.Scanner;

public class Cryptographers_Conundrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                if (arr[i] != 'P') c++;
            }else if (i % 3 == 1) {
                if (arr[i] != 'E') c++;
            }else if (i % 3 == 2) {
                if (arr[i] != 'R') c++;
            }
        }
        System.out.println(c);
    }
}

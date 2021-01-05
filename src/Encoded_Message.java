import java.util.Scanner;

public class Encoded_Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int k = 0; k < n; k++) {
            char[] str_arr = sc.next().toCharArray();
            int str_len_squared = (int) Math.sqrt(str_arr.length);

            for (int i = str_len_squared - 1; i >= 0; i--) {
                System.out.print(str_arr[i]);
                for (int j = i + str_len_squared; j < str_arr.length; j += str_len_squared) {
                    System.out.print(str_arr[j]);
                }
            }
            System.out.println();
        }
    }
}

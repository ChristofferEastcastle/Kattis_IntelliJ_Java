import java.util.Scanner;

public class Reverse_Rot_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";

        String input = sc.nextLine();

        while (input.toCharArray()[0] != '0'){
            String[] split = input.split(" ");
            int n = Integer.parseInt(split[0]);
            char[] arr = split[1].toCharArray();
            for (int i = arr.length - 1; i >= 0; i--) {
                int pos = alphabet.indexOf(arr[i]);
                int newPos = (pos + n) % 28;
                System.out.print(alphabet.charAt(newPos));
            }
            System.out.println();
            input = sc.nextLine();
        }
    }
}

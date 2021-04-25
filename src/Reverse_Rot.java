import java.util.Scanner;

public class Reverse_Rot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        while (in.toCharArray()[0] != '0' ) {
            String[] split = in.split(" ");
            int n = Integer.parseInt(split[0]);
            char[] arr = split[1].toCharArray();
            for (int i = arr.length - 1; i >= 0 ; i--) {
                System.out.print(getCorrectASCII((char) (checkFor_Dot(arr[i]) + n)));
            }
            System.out.println();
            in = sc.nextLine();
        }
    }

    private static char getCorrectASCII(char c) {
        if (c == 91) return '_';
        if (c == 92) return '.';
        if (c > 92) return (char) (c - 28);
        if (c < 65) return (char) (c + 28);
        return c;
    }

    private static char checkFor_Dot(char c){
        if (c == 46) return 92;
        if (c == 95) return 93;
        return c;
    }
}

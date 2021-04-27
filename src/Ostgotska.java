import java.util.Scanner;

public class Ostgotska {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String[] input = first.split(" ");
        double counter = 0;
        for (String str : input){
            char arr[] = str.toCharArray();
            for (int i = 0; i < 15; i++){
                if (i == str.length() - 1) break;

                if (arr[i] == 'a' && arr[i + 1] == 'e')
                    counter++;
            }
        }
        String out = "haer talar vi rikssvenska";

        double ratio = counter / input.length;

        if (ratio <= 0.40)
            System.out.println(out);
        else
            System.out.println(first);
    }
}
import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();

        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++){
            if (arr[i] != arr[i - 1])
                System.out.print(arr[i]);
        }
    }
}
import java.util.Scanner;

public class Hissing_Microphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (input.contains("ss"))
            System.out.println("hiss");
        else
            System.out.println("no hiss");
    }
}

import java.util.Scanner;

public class Rijeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        String mainString = "A";

        String newString = "A";
        String current = "A";
        int a = 1, b = 0;

        for (int i = 0; i < k; i++){
            if (current.equals("A")){
                current.replaceAll("A", "B");
                current = "B";

            }
            else if (current.equals("B")){
                mainString.replaceAll("B", "BA");
                current = "A";
            }
        }
        char[] arr = mainString.toCharArray();
        for (char c : arr){
            if (c == 'a')
                a++;
            else
                b++;
        }
        System.out.println(a);
        System.out.println(b);
    }
}

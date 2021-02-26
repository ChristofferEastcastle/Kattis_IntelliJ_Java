import java.util.Scanner;

public class Help_A_Phd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("");
            String str = "";
            boolean pNP = true;
            for (String s : input) {
                if (s.equals("+")){
                    str += " ";
                    pNP = false;
                } else
                    str += s;
            }
            if (!pNP){
                input = str.split(" ");
                System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
            }else
                System.out.println("skipped");

        }
    }
}

import java.util.Scanner;

public class Luhns_Checksum_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split("");
            StringBuilder str = new StringBuilder();
            int counter = 1;
            for (int j = arr.length - 1; j >= 0; j--){
                if (counter % 2 == 0) {
                    Integer doubled = Integer.parseInt(arr[j]) * 2;
                    // Checking if number has more than two digits
                    if (doubled.toString().length() >= 2){
                        doubled = SumOfDigits(doubled.toString());
                    }
                    arr[j] = doubled.toString();
                }
                counter++;
                str.append(arr[j]);
            }

            if (SumOfDigits(str.toString()) % 10 == 0)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }
    }

    private static int SumOfDigits(String str){
        int total = 0;
        for (String s : str.split("")){
            total += Integer.parseInt(s);
        }
        return total;
    }
}

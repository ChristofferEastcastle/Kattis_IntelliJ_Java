import java.util.HashMap;
import java.util.Scanner;

//WAS NOT QUICK ENOUGH, HAD TO USE C#
public class Relocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int q = sc.nextInt();
        for (int i = 1; i <= n + q; i++) {
            if (i <= n) {
                map.put(i, sc.nextInt());
            }else {
                int type = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (type == 1) {
                    map.replace(a, b);
                } else {
                    int x = map.get(a);
                    int c = map.get(b);
                    if (x >= c)
                        System.out.println(x - c);
                    else
                        System.out.println(c - x);
                }
            }
        }
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Poker_Hand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            char[] str = sc.next().toCharArray();
            if (map.containsKey(str[0])){
                int count = map.get(str[0]) + 1;
                map.replace(str[0], count);
            }else {
                map.put(str[0], 1);
            }
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count)
                count = entry.getValue();
        }
        System.out.println(count);
    }
}

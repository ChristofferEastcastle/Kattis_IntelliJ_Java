import java.io.IOException;
import java.util.*;

public class Stacking_Cups {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cup> cups = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String first = sc.next();
            String sec = sc.next();
            try {
                cups.add(new Cup(first, Integer.parseInt(sec)));
            } catch (NumberFormatException ex) {
                cups.add(new Cup(sec, Integer.parseInt(first) / 2));
            }
        }
        for (int i = 0; i < cups.size(); i++) {
            for (int j = 0; j < cups.size() - 1; j++) {
                if (cups.get(j).value > cups.get(j + 1).value) {
                    Cup temp = cups.get(j);
                    Cup temp2 = cups.get(j + 1);
                    cups.remove(temp2);
                    cups.remove(temp);
                    cups.add(j, temp2);
                    cups.add(j + 1, temp);
                }
            }
        }
        for (Cup c : cups)
            System.out.println(c.color);
    }
}
class Cup {
    public String color;
    public Integer value;

    public Cup(String color, Integer value){
        this.color = color;
        this.value = value;
    }
}

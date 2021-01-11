import java.util.ArrayList;
import java.util.Scanner;

public class Provinces_And_Gold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt() * 1;
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card("Province", 8, 6));
        cards.add(new Card("Duchy", 5, 3));
        cards.add(new Card("Estate", 2, 1));
        cards.add(new Card("Gold", 6, 3));
        cards.add(new Card("Silver", 3, 2));
        cards.add(new Card("Copper", 0, 1));

        String victory = "";
        String treasure = "";
        if (total == 0)
            treasure = "Copper";
        for (int i = 0; i < total; i++) {
            if (i % 2 == 0) {
                for (int j = 3; j <= 5; j++) {
                    if (total - cards.get(j).cost >= 0) {
                        treasure = (cards.get(j).name);
                        break;
                    }
                }
            } else {
                for (int j = 0; j <= 3; j++) {
                    if (total - cards.get(j).cost >= 0) {
                        victory = (cards.get(j).name);
                        break;
                    }
                }
            }
        }
        if (victory == "")
            System.out.println(treasure);
        else
            System.out.println(victory + " or " + treasure);
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T9_Spelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Character[]> map = getMap();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            char[] str = sc.nextLine().toCharArray();
            System.out.printf("Case #%d: ", i);
            String number = "0";
            char last = number.toCharArray()[0];
            char first;
            for(char c : str){
                if (c != ' ') {
                    number = getIntRep(c, map);
                    first = number.toCharArray()[0];
                    if (last == first)
                        System.out.print(" ");
                }else {
                    number = "0";
                    if (last == '0')
                        System.out.print(" ");
                }
                System.out.printf("%s", number);
                last = number.toCharArray()[number.toCharArray().length - 1];
            }
            System.out.print("\n");
        }
    }

    public static String getIntRep(char c, HashMap<Integer, Character[]> map){
        StringBuilder str = new StringBuilder();
        for (Map.Entry<Integer, Character[]> entry : map.entrySet()){
            Character[] arr = entry.getValue();
            for (int i = 1; i <= arr.length; i++){
                if (arr[i - 1] == c)
                    str.append(String.valueOf(entry.getKey()).repeat(i));
            }
        }
        return str.toString();
    }



    public static HashMap<Integer, Character[]> getMap(){
        HashMap<Integer, Character[]> map = new HashMap<>();
        map.put(2, new Character[]{'a', 'b', 'c'});
        map.put(3, new Character[]{'d', 'e', 'f'});
        map.put(4, new Character[]{'g', 'h', 'i'});
        map.put(5, new Character[]{'j', 'k', 'l'});
        map.put(6, new Character[]{'m', 'n', 'o'});
        map.put(7, new Character[]{'p', 'q', 'r', 's'});
        map.put(8, new Character[]{'t', 'u', 'v'});
        map.put(9, new Character[]{'w', 'x', 'y', 'z'});

        return map;
    }
}

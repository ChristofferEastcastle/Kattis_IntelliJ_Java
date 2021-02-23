import java.util.*;

public class Shopping_List {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            for (String str : arr){
                if (map.containsKey(str))
                    map.replace(str, map.get(str) + 1);
                else
                    map.put(str, 1);
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() == n)
                list.add(entry.getKey());
        }
        System.out.println(list.size());
        Collections.sort(list);
        for (String str : list)
            System.out.println(str);
    }
}
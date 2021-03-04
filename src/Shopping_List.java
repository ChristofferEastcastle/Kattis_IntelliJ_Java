import java.util.*;

public class Shopping_List {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            HashSet<String> set = new HashSet<>();
            for (String str : arr){
                if (set.contains(str))
                    continue;
                if (map.containsKey(str))
                    map.replace(str, map.get(str) + 1);
                else
                    map.put(str, 1);
                set.add(str);
                if (map.get(str) == n)
                    list.add(str);
            }
        }
        System.out.println(list.size());
        Collections.sort(list);
        for (String str : list)
            System.out.println(str);
    }
}

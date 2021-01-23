import java.util.HashMap;
import java.util.Scanner;

public class ACM_Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int total = 0;
        int correct = 0;
        int min = sc.nextInt();
        while (min != -1){
            String problem = sc.next();
            String status = sc.next();
            if (map.containsKey(problem) && status.equals("wrong")){
                map.replace(problem, map.get(problem) + 1);
            }else if (map.containsKey(problem) && status.equals("right")) {
                total += min + map.get(problem) * 20;
                correct++;
            }else if (!map.containsKey(problem) && status.equals("right")){
                total += min;
                correct++;
            }else{
                map.put(problem, 1);
            }
            min = sc.nextInt();
        }
        System.out.printf("%d %d%n", correct, total);
    }
}

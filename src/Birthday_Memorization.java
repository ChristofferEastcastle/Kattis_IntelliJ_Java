import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Birthday_Memorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<LocalDate, Person> map = new HashMap<>();

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            LocalDate date = LocalDate.parse(input[2] + "/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            String name = input[0];
            int val = Integer.parseInt(input[1]);
            Person p = new Person(name, val, date);
            if (map.containsKey(date)) {
                if (val > map.get(date).value)
                    map.replace(date, p);
            }else
                map.put(date, p);
        }

        int distinct = map.values().size();
        String[] names = new String[distinct];
        int nameCounter = 0;
        for (Person p : map.values()){
            names[nameCounter] = p.name;
            nameCounter++;
        }
        System.out.println(distinct);
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        for (String name : names)
            System.out.println(name);
    }
    /*
    private static void printMap(HashMap<LocalDate, ArrayList<Person>> map) {
        for (Map.Entry<LocalDate, ArrayList<Person>> entry : map.entrySet()){
            System.out.print(entry.getKey().format(DateTimeFormatter.ofPattern("dd/MM")));
            for (Person p : entry.getValue())
                System.out.printf(" %s : %d |", p.name, p.value);
            System.out.println();
        }
    }
    */
}
class Person{
    String name;
    int value;
    LocalDate date;

    Person(String name, int value, LocalDate date){
        this.name = name;
        this.value = value;
        this.date = date;
    }
}
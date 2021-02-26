import java.util.*;

public class Money_Matters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Friend> list = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Adding people to map
        for (int i = 0; i < n; i++) {
            list.add(new Friend(sc.nextInt()));
        }
        // Saving the friends of each person
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.get(x).setFriends(y);
            list.get(y).setFriends(x);
        }

        for (int i = 0; i < list.size(); i++){
            Friend friend = list.get(i);
            for (int friends : friend.getFriends()) {
                Friend friend2 = list.get(friends);
                if (friend.balance >= friend2.balance) {
                    friend2.balance += friend.balance;
                    friend.balance -= friend.balance;
                } else {
                    friend.balance += friend2.balance;
                    friend2.balance -= friend2.balance;
                }
            }
        }

        for (Friend friend : list)
            friend.print();


        for (Friend friend : list){
            if (friend.balance != 0) {
                for (Friend friend1 : list){
                    if (!friend1.equals(friend) && friend1.balance != 0){
                        for (int friends : friend.friends){
                            if (friend1.friends.contains(friends)) {
                                if (friend.balance >= friend1.balance) {
                                    friend1.balance += friend.balance;
                                    friend.balance -= friend.balance;
                                } else {
                                    friend.balance += friend1.balance;
                                    friend1.balance -= friend1.balance;
                                }
                            }
                        }
                    }
                }
            }
        }

        boolean possible = true;

        System.out.println();
        for (Friend friend : list){
            friend.print();
            if (friend.balance != 0){
                possible = false;
                break;
            }
        }
        if (possible)
            System.out.println("POSSIBLE");
        else
            System.out.println("IMPOSSIBLE");

    }
}


class Friend {
    ArrayList<Integer> friends = new ArrayList<>();
    Integer balance;

    public Friend(Integer balance, int... friends){
        this.balance = balance;
        setFriends(friends);
    }

    public void setFriends(int... friends){
        for (int friend : friends) {
            this.friends.add(friend);
        }
    }
    public ArrayList<Integer> getFriends(){
        return friends;
    }
    public void print(){
        System.out.printf("Balance: %d | Friends: ", this.balance);
        for (int i = 0; i < friends.size(); i++){
            System.out.printf("%d, ", friends.get(i));
        }
        System.out.println();
    }
}

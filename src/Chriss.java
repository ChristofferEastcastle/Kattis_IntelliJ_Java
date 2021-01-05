package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Chriss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();

        String second = sc.next();


        ArrayList<Character> message = new ArrayList<>();
        ArrayList<Character> key = new ArrayList<>();

        for (int i = 0; i < first.length(); i++) {
            char addme_first = first.charAt(i);
            message.add(addme_first);

            char addme_second = second.charAt(i);
            key.add(addme_second);

        }

        for (int i = 0; i < message.size(); i++) {
            int msg_value = (int) message.get(i);
            int key_value = (int) key.get(i) % 65;

            if (i % 2 == 0){
                msg_value -= key_value;
                if (msg_value < 65)
                    msg_value += 26;
            }
            else {
                msg_value += key_value;
                if (msg_value > 90)
                    msg_value -= 26;
            }
            System.out.print((char) msg_value);
        }

    }

}

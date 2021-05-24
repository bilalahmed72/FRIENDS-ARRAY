package myprac;
import java.util.Scanner;

public class friends {
    public static void main(String[] args) {
        System.out.println("How many friends do you have? ");
        Scanner sc = new Scanner(System.in);
        int ur_friends = sc.nextInt();
        String[] friends = new String[ur_friends];
        if (ur_friends>0) {
            for (int i = 0; i < ur_friends; i++) {
                System.out.println("Input friend " + (i + 1) + "'s Name");
                Scanner friends_input = new Scanner(System.in);
                String hisFriend_inp = friends_input.next();
                friends[i] = hisFriend_inp;
            }
        }
        for (String element : friends) {
            System.out.println(element);
        }
    }
}

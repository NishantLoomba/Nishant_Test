package ClassRoom;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int S = 0;
        int I = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int digit = ch - '0';
            S+= digit;
            I=I* 10 + digit;
        }
        System.out.println(S);
        System.out.println(I);

    }
}

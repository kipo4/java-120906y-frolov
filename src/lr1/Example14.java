package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ведите число a ");
        int a = in.nextInt();

        int b=a-1;

        int c=a+1;

        int d=a*2+b*2+c*2+2*a*b+2*a*c+2*b*c;

        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
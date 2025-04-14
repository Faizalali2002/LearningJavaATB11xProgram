package ex_09_While;

import java.util.Scanner;

public class Lab082_while_Fibo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num till u want fibo");
        int num = sc.nextInt();

        int a = 0, b =1;
        System.out.print(a+", "+b);


        int count = 2;

        while(count  < num ){
            int c = a + b;
            System.out.print(", "+c);
            a = b;
            b = c;
            count++;
        }
    }
}

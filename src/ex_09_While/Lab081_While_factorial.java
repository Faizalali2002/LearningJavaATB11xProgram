package ex_09_While;

import java.util.Scanner;

public class Lab081_While_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to find out its Factorial : ");
        int num = sc.nextInt();

        int fact = 1;
        if(num <= 0){
            System.out.println(num +" factorial is "+fact);
        }
        else {
            for (int i = 1; i <= num; i++) {
                fact = fact*i;
                System.out.println(fact);
            }
        }

        System.out.println(num +" factorial is "+fact);
    }
}

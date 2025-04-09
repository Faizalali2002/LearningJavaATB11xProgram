package ex_09_While;

import java.util.Scanner;

public class Lab0812_While_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to find its Factorial : ");
        int num = sc.nextInt();


        int fact = 1;
        int i = 1;
        if(num <=0 ) {
            System.out.println(num + " factorial is " + fact);
        }else {

            while (i <= num){
                fact = fact * i;
                i++;
            }
        }

        System.out.println(fact);

    }
}

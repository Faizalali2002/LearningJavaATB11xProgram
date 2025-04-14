package ex_11_Function;

import java.util.Scanner;

public class Lab089_Function_Arth {

    static int add(int a , int b){
        return a+b;
    }

    static int sub(int a , int b){
        return a-b;
    }

    static int div(int a ,int b){
        if(b == 0){
            throw new ArithmeticException("Not possible if the denominator is 0 ");
        }else {
            return a /b;
        }
    }

    static int prod(int a , int b){
        return a*b;
    }

    static int mod(int a , int b){
        return a%b;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Enter the int only, ");
            System.exit(0);
        }

        System.out.println("Enter the num2");
        int b = 0;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            System.out.println("Enter the int only, ");
            System.exit(0);
        }


        System.out.println(add(a,b));
        System.out.println(sub(a,b));
        System.out.println(div(a,b));
        System.out.println(prod(a,b));
        System.out.println(mod(a,b));

    }
}

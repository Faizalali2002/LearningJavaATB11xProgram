package ex_06_If_Condition;

public class Lab066_if_triangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[0]);


        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("This is an Equilateral triangle.");
            } else if (a == b || b == c || a == c) {
                System.out.println("This is an Isosceles triangle.");
            } else {
                System.out.println("This is a Scalene triangle.");
            }
        } else {
            System.out.println("These sides do not form a valid triangle.");
        }
    }
}

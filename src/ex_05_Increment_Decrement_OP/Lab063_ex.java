package ex_05_Increment_Decrement_OP;

public class Lab063_ex {

    public static void main(String[] args) {
//        int a = 5;
//        int b = a++ + ++a + a + a++;
//        System.out.println("a: " + a + ", b: " + b);
        System.out.println("----------------------------");

        int a = 1;
        int b = 2;
        int c = a++ + ++b + b++ + ++a;
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);


        int x = 1;
        x = x++ + ++x * x++ + --x;
        System.out.println(x);



        int y = 10;
        System.out.println(++y + y++ + y++);
        System.out.println(y);


        int d = 20;
        System.out.println(--d + d++ + d--);


    }
}

package ex_05_Increment_Decrement_OP;

public class Lab061_Inc_Dec_ex {
    public static void main(String[] args) {

                int x = 5;

                // Post-increment
                int a = x++; // a gets 5, x becomes 6
                System.out.println("Post-increment:");
                System.out.println("a = " + a); // 5
                System.out.println("x = " + x); // 6

                // Resetting x
                x = 5;

                // Pre-increment
                int b = ++x; // x becomes 6, b gets 6
                System.out.println("\nPre-increment:");
                System.out.println("b = " + b); // 6
                System.out.println("x = " + x); // 6
            }
        }



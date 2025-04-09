package ex_08_For_Loop;

public class Lab075_for_loop_IQ {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if(i % 2 == 0){
                System.out.println("Even : "+i);
            }
            else {
                System.out.println("Odd : "+i);
            }

        }
    }
}

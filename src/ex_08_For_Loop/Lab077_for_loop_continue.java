package ex_08_For_Loop;

public class Lab077_for_loop_continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5){
                continue;
            }
            System.out.println(i);

        }
    }
}

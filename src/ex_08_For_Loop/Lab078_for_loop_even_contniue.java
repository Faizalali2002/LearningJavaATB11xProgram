package ex_08_For_Loop;

public class Lab078_for_loop_even_contniue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            if(i % 2 != 0){
                continue;
            }

            System.out.println(i);

        }
    }
}

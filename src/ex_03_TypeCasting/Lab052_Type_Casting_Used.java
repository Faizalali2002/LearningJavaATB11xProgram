package ex_03_TypeCasting;

public class Lab052_Type_Casting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
//        int total = course+GST; // Narrow - Implicit
        int total1 = course+(int)GST; // Narrow - Explict
        System.out.println(total1);
       // Narrow - Explict - Data Loss

        float total2 = course+GST; // Widening - auto - implicit
        float total3 = (float)course+GST; // Widening  - Explicit
        System.out.println(total2);
        System.out.println(total3);






    }
}

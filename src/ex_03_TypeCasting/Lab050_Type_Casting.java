package ex_03_TypeCasting;

public class Lab050_Type_Casting {
    public static void main(String[] args) {
        int val  = 200;
        //byte b = val; // Invalid - Narrowing - Implicit Casting is not allowed.
        byte b2 = (byte)val; // Valid - Narrowing - Explicit Casting - Allowed.
        // Data Loss.
        System.out.println(b2);
    }
}

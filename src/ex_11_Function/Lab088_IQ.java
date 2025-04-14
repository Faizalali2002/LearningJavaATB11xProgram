package ex_11_Function;

public class Lab088_IQ {

   // Overloading = Same method name, but different parameters.
   public static void main(String[] args) {
       main(3.14f);
   }

    public static void main(String args) {

    }

    public static int main(int args) {
        return 10;
    }

    public static int main(float args) {
        return 10;
    }

    public static boolean main(boolean args) {
        return true;
    }
}

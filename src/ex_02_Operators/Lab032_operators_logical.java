package ex_02_Operators;

public class Lab032_operators_logical {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);
        boolean b = true;
        System.out.println(!!b);

        boolean c= true || false;
        System.out.println(c);

        boolean d = false || true;
        System.out.println(d);

        boolean e = true && false;
        System.out.println(e);

        boolean f = false && true;
        System.out.println(f);


        boolean g = true && true;
        System.out.println(g);

    }
}

package ex_12_String;

public class Lab090_string_immutable {
    public static void main(String[] args) {
        String name  = "faizal";
        name.toUpperCase();
        System.out.println(name);


        System.out.println(name.toUpperCase());

        String uppername = name.toUpperCase();
        System.out.println(uppername);
    }
}

package ex_11_Function;

public class Lab087_UD_Part1 {

    // User Defined Functions.

    // 1.Without Parameters and Without Return Type
    static void greet() {
        System.out.println("Hello World");
    }


    // 2.Without Parameters but With Return Type
    static String myName(){
        return "Saiyed Faizal Ali";
    }


    // 3.With Parameters and Without Return Type
    static  void addTwoNum(int a , int b){
        System.out.println("Sum : "+(a+b));
    }

    // 4. With Parameters and With Return Type
     static  int productTwoNum(int a, int b){
        return a*b;
     }

    public static void main(String[] args) {

       greet();

       String name = myName();
        System.out.println(name);

        addTwoNum(2,2);


        System.out.println(productTwoNum(2,2));
    }
}

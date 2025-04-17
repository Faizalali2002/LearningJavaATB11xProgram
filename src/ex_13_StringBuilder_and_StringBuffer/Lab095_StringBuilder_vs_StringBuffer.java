package ex_13_StringBuilder_and_StringBuffer;

public class Lab095_StringBuilder_vs_StringBuffer {
    public static void main(String[] args) {

        //String ->
        String name = "Faizal";
        String name1 = new String("Faizal");


        //StringBuilder ->
        StringBuilder stringBuilder = new StringBuilder("Faizal");


        //StringBuffer ->
        StringBuffer stringBuffer = new StringBuffer("Faizal");
    }
}

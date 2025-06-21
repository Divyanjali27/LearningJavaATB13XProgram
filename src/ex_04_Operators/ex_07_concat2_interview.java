package ex_04_Operators;

public class ex_07_concat2_interview {
    public static void main(String[] args) {

        String first_name = "divya";
        String last_name = "anju";

        int a = 10;
        int b = 10;

//        System.out.println(first_name + last_name + a + b);
//        System.out.println(a + b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub
    }
}

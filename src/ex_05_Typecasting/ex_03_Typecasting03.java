package ex_05_Typecasting;

public class ex_03_Typecasting03 {
    public static void main(String[] args) {
        int val  = 300;
        //byte b = val; //Narrowing int to byte (Implicit casting is not allowed)
        byte b = (byte)val; //Narrowing int to byte (Explicit casting is allowed)
        //Data loss
        System.out.println(b);
    }
}

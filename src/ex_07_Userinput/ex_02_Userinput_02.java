package ex_07_Userinput;

public class ex_02_Userinput_02 {
        public static void main (String [] args){
            System.out.println(args[0]); // java.lang.ArrayIndexOutOfBoundsException
            System.out.println(args[1]);
            System.out.println(args[2]);
            System.out.println(args[10]); // java.lang.ArrayIndexOutOfBoundsException
        }

}

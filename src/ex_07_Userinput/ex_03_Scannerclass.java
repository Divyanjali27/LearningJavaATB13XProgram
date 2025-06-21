package ex_07_Userinput;

import java.util.Scanner;

public class ex_03_Scannerclass {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");

        int age = scanner.nextInt();

        String caniVote = age >= 18? "Yes": "No";
        System.out.println(caniVote);

    }
}

package ex_10_Switch;

import java.util.Scanner;

public class ex_02_switch_without_break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 to 7");
        int day = scanner.nextInt();
        switch (day){
            case 1 :
                System.out.println("Mon");

            case 2 :
                System.out.println("tues");
            case 4 :
                System.out.println("Wed");
            case 5 :
                System.out.println("Thurs");
            case 6 :
                System.out.println("Fri");
            default:
                System.out.println("Not allowed");
        }

    }
}

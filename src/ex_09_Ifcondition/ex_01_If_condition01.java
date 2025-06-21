package ex_09_Ifcondition;

import java.util.Scanner;

public class ex_01_If_condition01 {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age<18){
            System.out.println("allow to vote");
        }
        else
        {
            System.out.println("Not Allow to vote");
        }
    }
}

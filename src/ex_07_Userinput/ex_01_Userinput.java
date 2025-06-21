package ex_07_Userinput;

public class ex_01_Userinput {
    public static void main(String[] args) {
        String age_string = args[0];
        System.out.println(age_string);
int age = Integer.parseInt(age_string);
String caniVote = age >= 18? "Yes": "No";
        System.out.println(caniVote);
    }
}

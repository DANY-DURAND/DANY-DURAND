import java.util.Scanner;

public class initialProgram{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
        long seconds= input.nextLong();
        long days= seconds/86400;
        long hours=(seconds%86400)/3600;
        long minutes=(seconds%3600)/60;
        long remainingSeconds = seconds % 60;
        System.out.println(seconds+" seconds is "+days+" day(s), "+hours+" hours, "+ minutes+" minutes and "+remainingSeconds+" seconds.");
        System.out.println((int)12.5F);
    }
}

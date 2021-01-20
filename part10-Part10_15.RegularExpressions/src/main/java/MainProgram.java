import java.sql.SQLOutput;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker check = new Checker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String day = scanner.nextLine();
        if(check.timeOfDay(day)) {
            System.out.println("The form is correct");
        }else {
            System.out.println("The form is incorrect");
        }
    }
}

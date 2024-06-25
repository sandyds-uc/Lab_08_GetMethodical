import java.sql.SQLOutput;
import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String firstName = SafeInput.getNonZeroLenString(in, "Enter your First Name");
        System.out.println("Your first name is: " + firstName);
        String lastName = SafeInput.getNonZeroLenString(in, "Enter your Last Name");
        System.out.println("Your last name is: " + lastName);

        int num = SafeInput.getInt(in, "Enter a number");
        System.out.println("The number you entered is: " + num);

        double dubNum = SafeInput.getDouble(in, "Enter the item's worth");
        System.out.println("The item is worth: " + dubNum);

        int rangeNum = SafeInput.getRangedInt(in, "Guess a number between 1 & 100", 1, 100);
        System.out.println("You guessed: " + rangeNum);

        double rangeDouble = SafeInput.getRangedDouble(in, "Enter the wrestler's weight", 133.0, 140.99999);
        System.out.println("The wrestler's weight is: " + rangeDouble);


    }
}
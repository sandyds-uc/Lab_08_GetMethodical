/**
 *
 * @author Daniel Sandy sandyds@mail.uc.edu
 */

import java.util.Scanner; // import Scanner class

public class DevTest // class
{
    /**
     *
     * @param args main method without specific parameters & void return
     */
    public static void main(String[] args) // main method
    {
        Scanner in = new Scanner(System.in); // declare Scanner variable in

        String firstName = SafeInput.getNonZeroLenString(in, "Enter your First Name"); // call getNonZeroLenString method
        System.out.println("Your first name is: " + firstName); // output getNonZeroLenString method
        String lastName = SafeInput.getNonZeroLenString(in, "Enter your Last Name"); // call getNonZeroLenString method
        System.out.println("Your last name is: " + lastName); // output getNonZeroLenString method

        int num = SafeInput.getInt(in, "Enter a number"); // call getInt method
        System.out.println("The number you entered is: " + num); // output getInt method

        double dubNum = SafeInput.getDouble(in, "Enter the item's worth"); // call getDouble method
        System.out.println("The item is worth: " + dubNum); // output getDouble method

        int rangeNum = SafeInput.getRangedInt(in, "Guess a number between 1 & 100", 1, 100); // call getRangedInt method
        System.out.println("You guessed: " + rangeNum); // output getRangedInt method

        double rangeDouble = SafeInput.getRangedDouble(in, "Enter the wrestler's weight", 133.0, 140.99999); // call getRangedDouble method
        System.out.println("The wrestler's weight is: " + rangeDouble); // output getRangedDouble method

        boolean continueYN = SafeInput.getYNConfirm(in, "Enter Y or N to turn them into true or false"); // call getYNConfirm method
        System.out.println("You selected: " + continueYN); // output getYNConfirm method

        String phoneNumber = SafeInput.getRegExString(in, "Enter your phone number [xxx-xxx-xxxx]", "\\d{3}-\\d{3}-\\d{4}"); // call regExString method
        System.out.println("You entered: " + phoneNumber); // output getRegExString method

        SafeInput.prettyHeader(in, "Enter a message to have it displayed in a pretty header"); // test prettyHeader method

    } // return main()
} // end class
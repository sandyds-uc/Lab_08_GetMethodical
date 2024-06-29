/**
 *
 * @author Daniel Sandy sandyds@mail.uc.edu
 */

import java.util.Scanner; // import Scanner class

public class Reggie // class Reggie
{
    /**
     *
     * @param args main method without specific parameters & void return
     */
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in); // store Scanner in in
        String SSN = SafeInput.getRegExString(in, "Enter your Social Security Number [xxx-xx-xxxx]", "^\\d{3}-\\d{2}-\\d{4}"); // method to input SSN
        System.out.println("Your social security number is: " + SSN); // output SSN
        String uCStudentID = SafeInput.getRegExString(in, "Enter your UC M Number [M12345]", "^(M|m)\\d{5}$"); // method to input UC M Number
        System.out.println("Your UC M Number is: " + uCStudentID); // output UC M Number
        String menuChoice = SafeInput.getRegExString(in, "Choose an option: Open, Save, View, or Quit [OSVQ]", "^[OoSsVvQq]"); // method to choose a menu option
        menuChoice = menuChoice.toUpperCase(); // ensure menu option is uppercase
        switch (menuChoice) { // switch statement dependent upon user menu choice
            case "O": // if user chose O
                System.out.println("You chose Open."); // output user chose Open
            break; // end switch statement
            case "S": // if user chose S
                System.out.println("You chose Save."); // output chose Save
            break; // end switch statement
            case "V": // if user chose V
                System.out.println("You chose View."); // output chose View
            break; // end switch statement
            default: // if user chose Q
                System.out.println("You chose Quit."); // output uuser chose Quit
            break; // end switch statement
        } // end switch
    } // return main()
} // end class
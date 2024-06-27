/**
 *
 * @author Daniel Sandy sandyds@mail.uc.edu
 */

import java.util.Scanner;

public class Reggie
{
    /**
     *
     */
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in);
        String SSN = SafeInput.getRegExString(in, "Enter your Social Security Number [xxx-xx-xxxx]", "^\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your social security number is: " + SSN);
        String uCStudentID = SafeInput.getRegExString(in, "Enter your UC M Number [M12345]", "^(M|m)\\d{5}$");
        System.out.println("Your UC M Number is: " + uCStudentID);
        String menuChoice = SafeInput.getRegExString(in, "Choose an option: Open, Save, View, or Quit [OSVQ]", "^[OoSsVvQq]");
        menuChoice = menuChoice.toUpperCase();
        switch (menuChoice) {
            case "O":
                System.out.println("You chose Open.");
            break;
            case "S":
                System.out.println("You chose Save.");
            break;
            case "V":
                System.out.println("You chose View.");
            break;
            default:
                System.out.println("You chose Quit.");
            break;
        }


    }
}
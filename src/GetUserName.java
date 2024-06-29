/**
 *
 * @author Daniel Sandy sandyds@mail.uc.edu
 */

import java.util.Scanner; // import Scanner class

public class GetUserName // class GetUserName
{
    /**
     *
     * @param args main method without specific parameter and does not return anything
     */
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in); // store Scanner in in
        String userName = SafeInput.getNonZeroLenString(in, "Enter username"); // method to input username
        System.out.println("Your username is: " + userName); // output username
    } // main()
} // end class

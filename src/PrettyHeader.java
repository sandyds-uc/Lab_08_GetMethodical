/**
 *
 * @author Daniel Sandy sandyds@mail.uc.edu
 */

import java.util.Scanner; // import Scanner class

public class PrettyHeader // class PrettyHeader
{
    /**
     *
     * @param args
     */
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in); // declare & initialize Scanner in variable

        SafeInput.prettyHeader(in, "Enter a message to be displayed in a custom header"); // call method to create custom message header
    } // return main()
} // end class
/**
 *
 * @author Daniel Sandy sandyds@mail.uc.edu
 */

import java.util.Scanner; // import Scanner class

public class FavNumbers // class FavNumbers
{
    /**
     *
     * @param args main method without specific parameters & void return
     */
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in); // store Scanner in in
        int num = SafeInput.getInt(in, "Enter your favorite integer"); // method to input favorite num
        System.out.println("Your favorite integer is: " + num); // output user's favorite num

        double decimalNum = SafeInput.getDouble(in, "Enter your favorite double"); // method to input favorite double
        System.out.println("Your favorite double is: " + decimalNum); // output user's favorite double
    } // return main()
} // end class
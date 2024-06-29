/**
 *
 * @author Daniel Sandy sandyds@mail.uc.edu
 */

import java.util.Scanner; // import Scanner class

public class CheckOut // class CheckOut
{
    /**
     *
     * @param args
     */
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in); // store Scanner in in
        double totalCost = 0.0; // variable for the total cost
        do { // loop to add multiple items
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the item price", 0.50, 10.0); // method for user to enter prices
            totalCost += itemPrice; // add to total price
        } while (SafeInput.getYNConfirm(in, "Do you want to continue")); // method to continue looping until user does not want to continue
        System.out.printf("\nYour total cost is: $%-6.2f", totalCost); // output total cost
    } // return main()
} // end class
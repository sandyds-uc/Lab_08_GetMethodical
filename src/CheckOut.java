/**
 *
 * @author Daniel Sandy sandyds@mail.uc.edu
 */

import java.util.Scanner;

public class CheckOut
{
    /**
     *
     * @param args
     */
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        do {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the item price", 0.50, 10.0);
            totalCost += itemPrice;
        } while (SafeInput.getYNConfirm(in, "Do you want to continue"));
        System.out.printf("\nYour total cost is: $%-6.2f", totalCost);
    }
}
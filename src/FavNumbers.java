/**
 *
 * @author Daniel Sandy sandyds@mail.uc.edu
 */

import java.util.Scanner;

public class FavNumbers
{
    /**
     *
     * @param args
     */
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in);
        int num = SafeInput.getInt(in, "Enter your favorite integer");
        System.out.println("Your favorite integer is: " + num);

        double decimalNum = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("Your favorite double is: " + decimalNum);
    }
}
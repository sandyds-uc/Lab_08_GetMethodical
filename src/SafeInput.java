/**
 *
 * @author Daniel Sandy sandyds@mail.uc.edu
 */

import java.util.Scanner;

public class SafeInput
{
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // set this to zero length & run loop until it is not zero length
        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while (retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int value = 0;
        boolean isDone = false;
        String trash = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();
                isDone = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }
        }while (!isDone);

        return value;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double value = 0.0;
        boolean isDone = false;
        String trash = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();
                isDone = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }
        }while (!isDone);

        return value;

    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int value = 0;
        boolean isDone = false;
        String trash = "";
        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();
                if (value >= low && value <= high)
                {
                    isDone = true;
                }
                else
                {
                    System.out.println("Number is out of range [" + low + " - " + high + "] not: " + value);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }
        }while(!isDone);

        return value;

    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double value = 0.0;
        boolean isDone = false;
        String trash = "";
        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();
                if (value >= low && value <= high)
                {
                    isDone = true;
                }
                else
                {
                    System.out.println("Number is out of range [" + low + " - " + high + "] not: " + value);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }
        }while(!isDone);

        return value;

    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String yNConfirm = "Y";
        boolean yNConfirmed = false;
        boolean isDone;
            System.out.print("\n" + prompt + " [Y/N]: ");
            yNConfirm = pipe.nextLine();
            if (yNConfirm.equalsIgnoreCase("Y"))
            {
                yNConfirmed = true;
                isDone = true;
            }
            else if (yNConfirm.equalsIgnoreCase("N"))
            {
                yNConfirmed = false;
                isDone = true;
            }
            else
            {
                System.out.println("You must enter a valid response [Y/N] not: " + yNConfirm);
            }

        return yNConfirmed;

    }



}

/**
 *
 * @author Daniel Sandy sandyds@mail.uc.edu
 */

import java.util.Scanner; // import Scanner class

public class BirthDateTime // class BirthDateTime
{
    /**
     *
     * @param args main method without parameters specified and returns void
     */
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in); // store Scanner in in
        boolean isDone = false; // variable to continue looping
        int day = 0; // variable to store day
        int year = SafeInput.getRangedInt(in, "Enter birth year", 1900, 2024); // method to get birth year
        int month = SafeInput.getRangedInt(in, "Enter birth month", 1, 12); // method to get birth month
        do { // validation loop
            day = SafeInput.getRangedInt(in, "Enter birth day", 1, 31); // method to get user birth day
            switch (day) // different maximum days for different months
            {
                case 30: // if 30 days
                    if (month == 2) //cannot be February
                    {
                        System.out.println("Invalid day for the month of " + month + ": " + day); // entered more days than there are in February
                    }
                    else // if not February
                    {
                        isDone = true; // the 30th can work
                    }
                break; // end case for the 30th
                case 31: // if 31 days
                    if (month == 2 | month == 4 | month ==6 | month == 9 | month == 11) // cannot be February, April, June, September, or November
                    {
                        System.out.println("Invalid day for the month of " + month + ": " + day); // entered more days than there are in this month
                    }
                    else // if any other month
                    {
                        isDone = true; // the 31st can work
                    }
                break; // end case for the 31st
                default: // any other number of days in range
                    isDone = true; // work for any month
                break; // end case for other numbered days
            }
        } while (!isDone); // end loop if user input valid day
        int hour = SafeInput.getRangedInt(in, "Enter birth hour", 1, 24); // method for hour of birth
        int minute = SafeInput.getRangedInt(in, "Enter birth minute", 1, 59); // method for minute of birth
        if (minute < 10) // if user input a single digit day
        {
            minute = Integer.parseInt("0" + minute); // add a 0 in front of the single digit day to make it two digits
        }

        System.out.println("You were born " + month + "-" + day + "-" + year + " at " + hour + ":" + minute + "."); // output user month, day, year, hour, & minute of birth
    } // return main()
} // end class
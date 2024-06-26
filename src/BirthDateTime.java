import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in);
        boolean isDone = false;
        int day = 0;
        int year = SafeInput.getRangedInt(in, "Enter birth year", 1900, 2024);
        int month = SafeInput.getRangedInt(in, "Enter birth month", 1, 12);
        do {
            day = SafeInput.getRangedInt(in, "Enter birth day", 1, 31);
            switch (day)
            {
                case 30:
                    if (month == 2)
                    {
                        System.out.println("Invalid day for the month of " + month + ": " + day);
                    }
                    else
                    {
                        isDone = true;
                    }
                break;
                case 31:
                    if (month == 2 | month == 4 | month ==6 | month == 9 | month == 11)
                    {
                        System.out.println("Invalid day for the month of " + month + ": " + day);
                    }
                    else
                    {
                        isDone = true;
                    }
                break;
                default:
                    isDone = true;
                break;
            }
        } while (!isDone);
        int hour = SafeInput.getRangedInt(in, "Enter birth hour", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter birth minute", 1, 59);
        if (minute < 10)
        {
            minute = Integer.parseInt("0" + minute);
        }

        System.out.println("You were born " + month + "-" + day + "-" + year + " at " + hour + ":" + minute + ".");
    }
}
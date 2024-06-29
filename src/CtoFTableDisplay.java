/**
 *
 * @author Daniel Sandy sandyds@mail.uc.edu
 */

public class CtoFTableDisplay // class CtoFTableDisplay
{
    /**
     *
     * @param args main method without specific parameters and a void return
     */
    public static void main(String[] args) // main()
    {
        System.out.println(); // return a line for visual effects
        System.out.println("Celsius     Fahrenheit"); // table header
        System.out.println("----------------------"); // header divider for visual effects
        for (double cTemp = -100; cTemp <= 100; cTemp += 1.0) // loop tp process values
        {
            System.out.printf("%6.2f\t\t%6.2f\n", cTemp, ctoF(cTemp)); // print in tabular format
        } // end loop

    } // return main()

    public static double ctoF(double cVal) // method to convert Celsius to Fahrenheit
        {
            double fVal = cVal * 9.0/5 + 32; // calculate celsius to fahrenheit & store in fahrenheit variable
            return fVal; // return fahrenheit
        } // end method
} // end class
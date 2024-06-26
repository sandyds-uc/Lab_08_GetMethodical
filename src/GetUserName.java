import java.util.Scanner;

public class GetUserName
{
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in);
        String userName = SafeInput.getNonZeroLenString(in, "Enter username");
        System.out.println("Your username is: " + userName);
    }
}

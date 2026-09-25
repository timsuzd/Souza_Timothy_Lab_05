import java.util.Scanner;

public class BirthMonth {
    void main()
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        IO.print("Enter your birth month [1-12]");
        if(in.hasNextInt());
        {
            birthMonth = in.nextInt();
            in.nextLine();
            if(birthMonth >= 1 && birthMonth <= 12)
            {
                IO.println("Your birth month is " + birthMonth);
            }
            else
            {
                IO.println("You entered " + birthMonth + ", an invalid birth month.");
                IO.println("Please re-run the program and enter a valid birth month.");
                System.exit(0);
            }
        }
    }
}

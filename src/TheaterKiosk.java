import java.util.Scanner;
class TheaterKiosk
{
    void main()
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        int age = 0;
        final int AGE_CUTOFF = 21;
        IO.print("Enter your age, must be 21 to see this film: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            if (age >= AGE_CUTOFF) {
                IO.println("You can see this film!");
            } else if (age <= AGE_CUTOFF && age >= 1) {
                IO.println("You're too young to see this film.");
            }
        }
        else
        {
            trash = in.nextLine();
            IO.println("Enter a valid age. You entered " + trash);
        }
    }
}

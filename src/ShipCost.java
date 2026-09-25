import java.util.Scanner;
class ShipCost
{
    void main()
    {
        Scanner in = new Scanner(System.in);

        double shipCost = 0;
        double itemPrice = 0;
        double totalCost = 0;

        IO.println("Enter your item price: "); /* Get the item price from the user */
        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble(); // read the value
            in.nextLine();
            if (itemPrice >= 100)
            {
                IO.println("Your total is at or over $100, shipping is free!");
            }
            else
            {
                shipCost = itemPrice * .02;
                totalCost = itemPrice + shipCost;
                IO.println("The shipping cost comes out to " + shipCost + ", so your total price will be " + totalCost);
            }
        }
        else
        {
            String trash = in.nextLine();
            IO.println("You must enter a valid number, " + trash + " is invalid.");
            IO.println("Re-run the program and try again.");
            System.exit(0);
        }
    }
}

        /*
        multiline comment
         */
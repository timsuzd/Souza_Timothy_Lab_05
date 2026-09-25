import java.util.Scanner;
public class PartyAffiliation {
    void main()
    {
        Scanner in = new Scanner(System.in);
        String partyAffil = "";

        IO.print("Emter your party affiliation [D/R/I]: ");
        partyAffil = in.nextLine();
        /*
        switch (partyAffil)
        {
            case "D":
                IO.println("You get a Democratic Donkey.");
                return;
            case "R":
                IO.println("You get a Republic Elephant.");
                return;
            case "I":
                IO.println("You get an Independent Person.");
                return;
            default:
                IO.println("I don't know what that is.");
                return;
        }

         */
        if(partyAffil.equalsIgnoreCase("D"))
        {
            IO.println("You get a Democratic Donkey.");
        }
        else if(partyAffil.equalsIgnoreCase("R"))
        {
            IO.println("You get a Republican Elephant.");
        }
        else if(partyAffil.equalsIgnoreCase("I"))
        {
            IO.println("You get an Independent Person.");
        }
        else
        {
            IO.println("I don't know what that party is: " + partyAffil);
        }
    }
}

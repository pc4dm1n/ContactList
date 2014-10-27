import java.util.*;

public class ContactList
{
    /**
        This program stores and displays contacts which are categorized as
        either personal or business.
    */
    public static void main(String args[])
    {
        boolean done = false;
        while(!done)
        {
            ArrayList<String> options = new ArrayList<String>();
            options.add("Add a business contact");
            options.add("Add a personal contact");
            options.add("Display contacts");
            options.add("Quit");
            Menu mainMenu = new Menu(options);
            Treeset bContacts = new Treeset();
            String err = "Error: invalid selection.";
            System.out.println();
            for(int i = 0; i < mainMenu.getOptions().size(); i++)
            {
                System.out.printf("%s. %s\n", i + 1, mainMenu.getOptions().get(i));
            }
            System.out.printf("\nChoose an option: ");
            Scanner in = new Scanner(System.in);
            if(in.hasNextInt())
            {
                int selection = in.nextInt();
                if(selection > 0 && selection <= mainMenu.getOptions().size())
                {
                    if(selection == 4) // quit
                    {
                        done = true;
                    }
                    else if(selection == 3) // display contacts
                    {
                        
                }
                else
                {
                    System.out.printf("\n%s", err);
                    System.out.println();
                }
            }
            else
            {
                System.out.printf("\n%s", err);
                System.out.println();
                in.next(); // prevent infinite looping if non-int is given
            }
        }
    }
}

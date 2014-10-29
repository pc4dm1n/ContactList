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
        Scanner in = new Scanner(System.in);
        ArrayList<String> options = new ArrayList<String>(); // main menu options
        options.add("Add a business contact");
        options.add("Add a personal contact");
        options.add("Display contacts");
        options.add("Quit");
        Menu mainMenu = new Menu(options);
        TreeSet<Contact> bContacts = new TreeSet<Contact>(); // business contacts list
        TreeSet<Contact> pContacts = new TreeSet<Contact>(); // personal contacts list
        Iterator<Contact> itr;
        String err = "Error: invalid selection.";
        while(!done)
        {
            System.out.println();
            for(int i = 0; i < mainMenu.getOptions().size(); i++)
            {
                System.out.printf("%s. %s\n", i + 1, mainMenu.getOptions().get(i));
            }
            System.out.printf("\nChoose an option: ");
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
                        System.out.println();
                        if(bContacts.size() > 0)
                        {
                            System.out.println("=====================");
                            System.out.println("| Business Contacts |");
                            System.out.println("=====================");
                            itr = bContacts.iterator();
                            displayContacts(itr);
                        }
                        if(pContacts.size() > 0)
                        {
                            System.out.println("=====================");
                            System.out.println("| Personal Contacts |");
                            System.out.println("=====================");
                            itr = pContacts.iterator();
                            displayContacts(itr);
                        }
                        else if(bContacts.size() == 0 && pContacts.size() == 0)
                        {
                            System.out.println("No contacts found.  Please enter business and/or personal contacts.");
                        }
                    }
                    else if(selection == 2) // add personal contact
                    {
                        boolean complete = false;
                        while(!complete)
                        {
                            ArrayList<String> info = new ArrayList<String>();
                            System.out.println();
                            System.out.println("Create a new personal contact:");
                            System.out.print("Enter contact first name> ");
                            info.add(in.next());
                            System.out.print("Enter contact last name> ");
                            info.add(in.next());
                            System.out.println("Enter contact address information:");
                            System.out.print("Enter building number> ");
                            info.add(in.next());
                            System.out.print("Enter cardinal direction \"N, S, SE...\"> ");
                            info.add(in.next());
                            System.out.print("Enter street name> ");
                            info.add(in.next());
                            System.out.print("Enter street tag \"AVE, BLVD...\"> ");
                            info.add(in.next());
                            System.out.print("Enter city> ");
                            info.add(in.next());
                            System.out.print("Enter state code \"AK, AL...\"> ");
                            info.add(in.next());
                            System.out.print("Enter zip code> ");
                            info.add(in.next());
                            System.out.print("Enter contact ten-digit phone number \"5555555555\"> ");
                            info.add(in.next());
                            System.out.print("Enter contact email address> ");
                            info.add(in.next());
                            System.out.print("Enter contact date of birth \"YYYYMMDD\"> ");
                            info.add(in.next());
                            pContacts.add
                            (
                                (
                                    new PersonalContact
                                    (
                                        info.get(0), info.get(1), info.get(2), info.get(3), info.get(4),
                                        info.get(5), info.get(6), info.get(7), info.get(8), info.get(9),
                                        info.get(10), info.get(11)
                                    )
                                )
                            );
                            System.out.print("Create another contact (Y or N): ");
                            String input = in.next();
                            if(input.toLowerCase().equals("n"))
                            {
                                complete = true;
                            }
                        }
                    }
                    else if(selection == 1) // add business contact
                    {
                        boolean complete = false;
                        while(!complete)
                        {
                            ArrayList<String> info = new ArrayList<String>();
                            System.out.println();
                            System.out.println("Create a new business contact:");
                            System.out.print("Enter contact first name> ");
                            info.add(in.next());
                            System.out.print("Enter contact last name> ");
                            info.add(in.next());
                            System.out.println("Enter contact address information:");
                            System.out.print("Enter building number> ");
                            info.add(in.next());
                            System.out.print("Enter cardinal direction \"N, S, SE...\"> ");
                            info.add(in.next());
                            System.out.print("Enter street name> ");
                            info.add(in.next());
                            System.out.print("Enter street tag \"AVE, BLVD...\"> ");
                            info.add(in.next());
                            System.out.print("Enter city> ");
                            info.add(in.next());
                            System.out.print("Enter state code \"AK, AL...\"> ");
                            info.add(in.next());
                            System.out.print("Enter zip code> ");
                            info.add(in.next());
                            System.out.print("Enter contact ten-digit phone number \"5555555555\"> ");
                            info.add(in.next());
                            System.out.print("Enter contact email address> ");
                            info.add(in.next());
                            System.out.print("Enter job title> ");
                            info.add(in.next());
                            System.out.print("Enter organization name> ");
                            info.add(in.next());
                            bContacts.add
                            (
                                (
                                    new BusinessContact
                                    (
                                        info.get(0), info.get(1), info.get(2), info.get(3), info.get(4),
                                        info.get(5), info.get(6), info.get(7), info.get(8), info.get(9),
                                        info.get(10), info.get(11), info.get(12)
                                    )
                                )
                            );
                            System.out.print("Create another contact (Y or N): ");
                            String input = in.next();
                            if(input.toLowerCase().equals("n"))
                            {
                                complete = true;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("How did you get here!?");
                    }
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
    public static void displayContacts(Iterator<Contact> itr)
    {
        while(itr.hasNext())
        {
            ArrayList<String> temp = itr.next().getContact();
            for(int i = 0; i < temp.size(); i++)
            {
                String element = temp.get(i);
                if(element.equals(""))
                {
                    continue;
                }
                else
                {
                    System.out.println(element);
                }
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class PersonalContactTester
{
    public static void main(String args[])
    {
        PersonalContact samTClaws = new PersonalContact
        (
            "Sam", "Claws", "146", Address.Direction.N, "Polar", "Way",
            "Anchorage", Address.State.AK, "11111", "5555551254", "olesamclaws@email.com",
            1990, 10, 01
        );
        PersonalContact hatGuy = new PersonalContact
        (
            "Hat", "Guy", "432", Address.Direction.S, "North", "ST",
            "Nowhere", Address.State.AR, "22222", "5555559451", "hatlovindude@yahoo.fake",
            1975, 03, 20
        );
        PersonalContact hatDude = new PersonalContact
        (
            "Hat", "Dude", "432", Address.Direction.S, "North", "ST",
            "Nowhere", Address.State.AR, "22222", "5555559451", "",
            1975, 03, 20
        );
        PersonalContact headWearMan = new PersonalContact
        (
            "Head Wear", "Man", "516", Address.Direction.SW, "North", "AVE",
            "Nowhere", Address.State.AR, "22222", "5555559451", "lovetowearheadfashion@uprllynvrhrdofthisdomain.com",
            1970, 03, 20
        );
        PersonalContact johnJohns = new PersonalContact
        (
            "John", "Johnson", "21439", Address.Direction.SW, "Main", "BLVD",
            "Sometown", Address.State.IA, "01234", "5555551124", "",
            1970, 8, 31
        );
        PersonalContact joeEveryman = new PersonalContact
        (
            "Joe", "Everyman", "111", Address.Direction.E, "Every", "ST",
            "America", Address.State.MN, "00000", "5555551122", "joeeveryman@everywhere.com",
            1980, 12, 19
        );
        ArrayList<Contact> myContacts = new ArrayList<Contact>();
        myContacts.add(johnJohns);
        myContacts.add(samTClaws);
        myContacts.add(hatGuy);
        myContacts.add(hatDude);
        myContacts.add(headWearMan);
        myContacts.add(joeEveryman);
        ContactCompare test = new ContactCompare();
        Collections.sort(myContacts, test);
        for(int i = 0; i < myContacts.size(); i++)
        {
            for(int j = 0; j < myContacts.get(i).getContact().size(); j++)
            {
                String temp = myContacts.get(i).getContact().get(j);
                if(temp.equals(""))
                {
                    continue;
                }
                else
                {
                    System.out.println(temp);
                }
            }
            System.out.println();
        }
    }
}

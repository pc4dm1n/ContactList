import java.util.*;
public class PersonalContactTester
{
    public static void main(String args[])
    {
        PersonalContact samTClaws = new PersonalContact
        (
            "Sam", "Claws", "146", "N", "Polar", "Way",
            "Anchorage", "AK", "11111", "5555551254", "olesamtclaws@email.com",
            "19900101"
        );
        PersonalContact hatGuy = new PersonalContact
        (
            "Hat", "Guy", "432", "S", "North", "ST",
            "Nowhere", "ar", "22222", "5555559451", "hatlovindude@yahoo.fake",
            "19750320"
        );
        PersonalContact hatDude = new PersonalContact
        (
            "Hat", "Dude", "432", "S", "North", "ST",
            "Nowhere", "AR", "22222", "5555559450", "",
            "19701010"
        );
        PersonalContact headWearMan = new PersonalContact
        (
            "Head Wear", "Man", "516", "S", "North", "AVE",
            "Nowhere", "AR", "22222", "5555559451", "lovetowearheadfashion@uprllynvrhrdofthisdomain.com",
            "19700220"
        );
        PersonalContact johnJohns = new PersonalContact
        (
            "John", "Johnson", "21439", "S", "Main", "BLVD",
            "Sometown", "IA", "01234", "5555551124", "",
            "19600601"
        );
        PersonalContact joeEveryman = new PersonalContact
        (
            "Joe", "Everyman", "111", "E", "Every", "ST",
            "America", "MN", "00000", "5555551122", "joeeveryman@everywhere.com",
            "19801219"
        );
        TreeSet<Contact> myContacts = new TreeSet<Contact>();
        Iterator<Contact> iterator;
        myContacts.add(johnJohns);
        myContacts.add(samTClaws);
        myContacts.add(hatGuy);
        myContacts.add(hatDude);
        myContacts.add(headWearMan);
        myContacts.add(joeEveryman);
        iterator = myContacts.iterator();
        
        while(iterator.hasNext())
        {
            ArrayList<String> temp = iterator.next().getContact();
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

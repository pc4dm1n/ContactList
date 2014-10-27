import java.util.*;
public class ContactCompare implements Comparator<Contact>
{
    public int compare(Contact one, Contact two)
    {
        int c = one.getFname().compareTo(two.getFname());
        if(c == 0)
        {
            return one.getLname().compareTo(two.getLname());
        }
        else
        {
            return c;
        }
    }
}

import java.util.*;

public class PersonalContact extends Contact
{
    private Date dateOfBirth;
    
    /**
        Creates a new PersonalContact
        @param fn the contact first name
        @param ln the contact last name
        @param no the contact address building number
        @param dir the direction of the address
        @param sn the address street name
        @param sTag the street tag (AVE, BLVD, RD, etc.)
        @param c the city of the address
        @param st the address State
        @param z the address zip code
        @param pn the contact phone number
        @param em the contact email address
        @param yyyy a four-digit year
        @param mm a two-digit month
        @param dd a two-digit day
    */
    public PersonalContact
    (
        String fn, String ln,
        String no, Address.Direction dir, String sn, String sTag, String c, Address.State st, String z,
        String pn, String em, int yyyy, int mm, int dd
    )
    {
        setFname(fn);
        setLname(ln);
        setAddress(new Address(no, dir, sn, sTag, c, st, z));
        setPhoneNo(new PhoneNo(pn));
        setEmail(em);
        setDateOfBirth(yyyy, mm, dd);
    }

    /**
        Gets dateOfBirth in number of milliseconds offset from Epoch
        @param y year
        @param m month
        @param d day
    */
    public void setDateOfBirth(int y, int m, int d) throws IllegalArgumentException
    {
        if(y < 1000 || (m < 1 || m > 12) || (d < 1 || d > 31))
        {
            throw new IllegalArgumentException("Illegal values supplied.  Expected YYYY, MM, DD.");
        }
        else
        {
            Calendar c = new GregorianCalendar(y, m, d);
            dateOfBirth = c.getTime();
        }
    }
    
    public ArrayList<String> getContact()
    {
        ArrayList<String> info = new ArrayList<String>();
        info.add(getFname() + " " + getLname());
        info.add(getAddress());
        info.add(getPhoneNo());
        info.add(getEmail());
        info.add(dateOfBirth.toString());
        return info;
    }
}

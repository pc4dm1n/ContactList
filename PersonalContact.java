import java.util.*;
import java.text.*;

public class PersonalContact extends Contact
{
    /**
        This class extends the Contact class to produce objects for storing personal
		contacts.
    */
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
        @param dob an eight-digit date in the form YYYYMMDD
    */
    public PersonalContact
    (
        String fn, String ln,
        String no, String dir, String sn, String sTag, String c, String st, String z,
        String pn, String em, String dob
    ) throws IllegalArgumentException
    {
        dir = dir.toUpperCase();
        st = st.toUpperCase();
        setFname(fn);
        setLname(ln);
        setAddress(new Address(no, Address.Direction.valueOf(dir), sn, sTag, c, Address.State.valueOf(st), z));
        setPhoneNo(new PhoneNo(pn));
        setEmail(em);
        setDateOfBirth(dob);
    }

    /**
        Sets dateOfBirth from String (YYYYMMDD).
        @param dob a String object representing a specific date
    */
    public void setDateOfBirth(String dob) throws IllegalArgumentException
    {
        int y;
        int m;
        int d;
        String err = "Illegal values supplied.  Expected YYYYMMDD.";
        if(dob.length() < 8)
        {
            throw new IllegalArgumentException(err);
        }
        else
        {
            y = Integer.parseInt(dob.substring(0, 4));
            m = Integer.parseInt(dob.substring(4, 6));
            m = m - 1;
            d = Integer.parseInt(dob.substring(6));
        }
        if(y < 1000 || (m < 0 || m > 11) || (d < 1 || d > 31))
        {
            throw new IllegalArgumentException(err);
        }
        else
        {
            Calendar c = new GregorianCalendar(y, m, d);
            dateOfBirth = c.getTime();
        }
    }
    /**
        Gets all contact instance variables and returns them in an ArrayList<String>.
        @return an ArrayList<String> of contact instance variables.
    */
    public ArrayList<String> getContact()
    {
        SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy");
        String dobResult = f.format(dateOfBirth).toString();
        ArrayList<String> info = new ArrayList<String>();
        info.add(getFname() + " " + getLname());
        info.add(getAddress());
        info.add(getPhoneNo());
        info.add(getEmail());
        info.add("Birthday: " + dobResult);
        return info;
    }
}

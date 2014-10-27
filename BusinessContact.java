import java.util.*;
public class BusinessContact extends Contact
{
    private String jobTitle;
    private String organization;
    
    /**
        Creates a new BusinessContact
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
        @param jt the contact job title
        @param org the contact organization
    */
    public BusinessContact
    (
        String fn, String ln,
        String no, Address.Direction dir, String sn, String sTag, String c, Address.State st, String z,
        String pn, String em, String jt, String org
    )
    {
        setFname(fn);
        setLname(ln);
        setAddress(new Address(no, dir, sn, sTag, c, st, z));
        setPhoneNo(new PhoneNo(pn));
        setEmail(em);
        jobTitle = jt;
        organization = org;
    }
    
    /**
        Builds an ArrayList containing the contact information.
        @return info an ArrayList containing contact information
    */
    public ArrayList<String> getContact()
    {
        ArrayList<String> info = new ArrayList<String>();
        info.add(getFname() + " " + getLname());
        info.add(jobTitle);
        info.add(organization);
        info.add(getAddress());
        info.add(getPhoneNo());
        info.add(getEmail());
        return info;
    }
}

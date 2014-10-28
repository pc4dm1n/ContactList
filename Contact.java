import java.util.*;

public abstract class Contact implements Comparable<Contact>
{
    /**
        This abstract class is for storing different types of contacts.
    */
    private String fname;
    private String lname;
    private Address address;
    private PhoneNo phoneNo;
    private String email;

    public abstract ArrayList<String> getContact();
    
    public void setFname(String fn)
    {
        this.fname = fn;
    }
    public String getFname()
    {
        return fname;
    }
    public void setLname(String ln)
    {
        this.lname = ln;
    }
    public String getLname()
    {
        return lname;
    }
    public void setAddress(Address addr)
    {
        this.address = addr;
    }
    public String getAddress()
    {
        return address.getAddress();
    }
    public void setPhoneNo(PhoneNo pn)
    {
        this.phoneNo = pn;
    }
    public String getPhoneNo()
    {
        return phoneNo.getPhoneNo();
    }
    public void setEmail(String em)
    {
        this.email = em;
    }
    public String getEmail()
    {
        return email;
    }
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        ArrayList<String> a = this.getContact();
        for(int i = 0; i < a.size(); i++)
        {
            s.append(a.get(i) + " ");
        }
        String result = s.toString();
        return result.trim();
    }
    public int hashCode()
    {
        return this.toString().hashCode();
    }
    public boolean equals(Contact c)
    {
        return this.toString().equals(c.toString());
    }
    public int compareTo(Contact c)
    {
        return this.toString().compareTo(c.toString());
    }
}

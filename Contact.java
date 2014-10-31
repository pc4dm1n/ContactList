import java.util.*;
import java.util.regex.*;

public abstract class Contact implements Comparable<Contact>
{
    /**
        This abstract class allows the creation of different Contact objects (business, personal...)
		for the storing of contact information.
    */
    private String fname;
    private String lname;
    private Address address;
    private PhoneNo phoneNo;
    private String email;

    public abstract ArrayList<String> getContact();
    /**
		Sets Contact first name
		@param fn a first name
	*/
    public void setFname(String fn)
    {
        this.fname = fn;
    }
	/**
		Returns a Contact object's first name.
		@return the Contact first name.
	*/
    public String getFname()
    {
        return fname;
    }
	/**
		Sets the last name value.
		@param ln the Contact last name.
	*/
    public void setLname(String ln)
    {
        this.lname = ln;
    }
	/**
		Gets the last name of a Contact object.
		@return contact last name
	*/
    public String getLname()
    {
        return lname;
    }
	/**
		Assigns a Contact object's address variable.
		@param addr an Address object belonging to Contact
	*/
    public void setAddress(Address addr)
    {
        this.address = addr;
    }
	/**
		Gets Address information for this Contact.
		@return a String value for Contact Address.
	*/
    public String getAddress()
    {
        return address.getAddress();
    }
	/**
		Sets the Contact Phone number
		@param pn a phone number for Contact
	*/
    public void setPhoneNo(PhoneNo pn)
    {
        this.phoneNo = pn;
    }
	/**
		Gets the Phone number for this Contact
		@return a String value for Contact Phone number.
	*/
    public String getPhoneNo()
    {
        return phoneNo.getPhoneNo();
    }
	/**
		Sets an email address for Contact.
		@param em an email address for Contact
	*/
    public void setEmail(String em) throws IllegalArgumentException
    {
        boolean match = Pattern.matches(".+@.+\\..+", em);
        if(match)
        {
            this.email = em;
        }
        else
        {
            throw new IllegalArgumentException("Error: invalid email address.");
        }
    }
	/**
		Gets Contact email address.
		@return Contact email address.
	*/
    public String getEmail()
    {
        return email;
    }
	/**
		Returns Contact values as a complete String.
		@return all Contact values
	*/
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
	/**
		Overridden hashCode method returns a hash of entire Contact.
		@return Contact hash value
	*/
    public int hashCode()
    {
        return this.toString().hashCode();
    }
	/**
		Overridden equals method compares entire Contact to another
		so Contacts may have the same name, but still be different.
		@param c the Contact against which to compare this Contact
		@return boolean
	*/
    public boolean equals(Contact c)
    {
        return this.toString().equals(c.toString());
    }
	/**
		Overridden compareTo compares entire Contact to another
		for natural ordering.
		@param c the Contact against which to compare this Contact.
		@param int the value 0 if the argument string is equal to
		this string; a value less than 0 if this string is
		lexicographically less than the string argument; and a
		value greater than 0 if this string is lexicographically
		greater than the string argument.
	*/
    public int compareTo(Contact c)
    {
        return this.toString().compareTo(c.toString());
    }
}

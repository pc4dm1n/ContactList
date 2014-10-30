public class PhoneNo
{
    /**
        This class creates phone number object for use with contacts
    */
    private StringBuilder number = new StringBuilder();
    
    /**
        Creates an empty PhoneNo object.
    */
    public PhoneNo()
    {
        this.number.append("");
    }

    /**
        Creates a new PhoneNo object from a single String.
        @param num A string representing a 10-digit phone number.
    */
    public PhoneNo(String num)
    {
        try
        {
            setPhoneNo(num);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    /**
        Returns a formatted phone number
        @return a formatted phone number String (000) 000-0000
    */
    public String getPhoneNo()
    {
        return number.toString();
    }
    /**
        Assigns a new value to the PhoneNo object.
        @param num a 10-digit phone number
    */
    public void setPhoneNo(String num) throws IllegalArgumentException
    {
        if(num.length() != 10)
        {
            throw new IllegalArgumentException("Expected 10-digit number without format characters (5555555555).");
        }
        else
        {
            String temp = "(" + num.substring(0,3) + ") " + num.substring(3,6) + "-" + num.substring(6);
            this.number.append(temp);
        }
    }
}

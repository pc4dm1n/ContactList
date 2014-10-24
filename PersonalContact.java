public class PersonalContact extends Contact
{
    private Date dateOfBirth;
    
    /**
        Gets dateOfBirth in number of milliseconds offset from Epoch
        @param y year
        @param m month
        @param d day
    */
    public void setDateOfBirth(int y, int m, int d)
    {
        Calendar c = c.getInstance();
        c.set(y, m, d);
        dateOfBirth = c.getTime();
    }
    
    public String getContact()
    {
        ArrayList<String> info = new ArrayList<String>();
        info.add(getFname());
        info.add(getLname());
        info.add(getAddress());
        info.add(getPhoneNo());
        info.add(getEmail());
        info.add(dateOfBirth.toString());
        return info;
    }
}

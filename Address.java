public class Address
{
    /**
        This class creates Address objects for use with Contacts.
    */
    public enum State
    {
        AL, AK, AZ, AR, CA, CO, CT, DE, FL, GA, HI, ID, IL,
        IN, IA, KS, KY, LA, ME, MD, MA, MI, MN, MS, MO, MT,
        NE, NV, MH, NJ, NM, NY, NC, ND, OH, OK, OR, PA, RI,
        SC, SD, TN, TX, UT, VT, VA, WA, WV, WI, WY, AS, DC,
        FM, GU, MP, PW, PR, VI, AE, AA, AP
    }
    public enum Direction
    {
        N, NE, E, SE, S, SW, W, NW
    }
    private String buildingNum;
    private Direction direction;
    private String streetName;
    private String streetTag;
    private String city;
    private State state;
    private String zip;
    
    /**
        Creates an empty Address
    */
    public Address()
    {
        this.buildingNum = "";
        this.direction = Direction.N;
        this.streetName = "";
        this.streetTag = "";
        this.city = "";
        this.state = State.AL;
        this.zip = "";
    }
    /**
        An overloaded constructor for building contacts with all necessary information.
        @param no a building number.
        @param dir a cardinal direction.
        @param sn a street name
        @param sTag a street tag (AVE, ST, BLVD, etc.)
        @param c the name of a city
        @param st a standard abbreviation representing one of the 50 United States or its territories.
        @param z a zip code
    */
    public Address(String no, Direction dir, String sn, String sTag, String c, State st, String z)
    {
        this();
        setAddress(no, dir, sn, sTag, c, st, z);
    }
    
    /**
        Sets new values for Address
        @param no the building number
        @param dir a cardinal direction
        @param sn a street name
        @param sTag a street tag (AVE, ST, BLVD, etc.)
        @param c the name of a city
        @param st a standard abbreviation representing one of the 50 United States or its territories.
        @param z this address's zip code
    */
    public void setAddress(String no, Direction dir, String sn, String sTag, String c, State st, String z)
    {
        this.buildingNum = no;
        this.direction = dir;
        this.streetName = sn;
        this.streetTag = sTag;
        this.city = c;
        this.state = st;
        this.zip = z;
    }
    
    /**
        Builds a complete address String object using all address instance variables.
        @return a String object containing the complete address.
    */
    public String getAddress()
    {
        StringBuilder address = new StringBuilder();
        address.append(buildingNum + " " + direction + " " + streetName + " " + streetTag + " " + city + ", " + state + " " + zip);
        return address.toString();
    }
}

import java.util.*;
public class BusinessContactTester
{
    public static void main(String args[])
    {
        BusinessContact johnSmith = new BusinessContact
        (
            "John", "Smith",
            "123", Address.Direction.S, "Somwhere", "Overtherainbow", "AVE", Address.State.MN, "01234",
            "5555555555",
            "jsmith@compuserve.com",
            "Keeper",
            "The Fighting Quids"
        );
        ArrayList<String> temp = new ArrayList<String>();
        temp.addAll(johnSmith.getContact());
        for(String elements : temp)
        {
            System.out.println(elements);
        }
    }
}

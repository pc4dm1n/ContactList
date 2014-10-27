import java.util.*;

public class MenuTester
{
    public static void main(String args[])
    {
        ArrayList<String> options = new ArrayList<String>();
        options.add("Choose me!");
        options.add("No, choose me!!");
        options.add("Choose me instead!");
        Menu newMenu = new Menu(options);
        for(int i = 0; i < options.size(); i++)
        {
            System.out.println(options.get(i).toString());
        }
    }
}

import java.util.*;

public class Menu
{
    /**
        This class builds menus for command-line usage.
    */
    private ArrayList<String> options;
    /**
        Creates a new menu with options.
        @param opt an ArrayList of menu options.
    */
    public Menu(ArrayList<String> opt)
    {
        this.options = opt;
    }
    /**
        Creates an empty Menu.
    */
    public Menu()
    {
        this.options = new ArrayList<String>();
    }
    /**
        Sets menu options.  This method is overloaded to overwrite existing
        menu options if an ArrayList is passed as an argument.
    */
    public void setOptions(int index, String opt)
    {
        options.add(index, opt);
    }
    public void setOptions(ArrayList<String> opt)
    {
        options = opt;
    }
    /**
        Returns a Menu object.
        @return an ArrayList containing menu options.
    */
    public ArrayList<String> getOptions()
    {
        return options;
    }
}

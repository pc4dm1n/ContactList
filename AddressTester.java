public class AddressTester
{
    /**
        A simple tester class for the Address class
    */
    public static void main(String args[])
    {
        Address add1 = new Address("124", Address.Direction.N, "Phony", "AVE", "Nowhere", Address.State.AZ, "12345");
        Address add2 = new Address();
        add2.setAddress("1111", Address.Direction.S, "Fake", "BLVD", "Cityhere", Address.State.WY, "00000");
        System.out.println(add1.getAddress());
        System.out.println(add2.getAddress());
    }
}

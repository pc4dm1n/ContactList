public class PhoneNoTester
{
    /**
        A tester class for the PhoneNo class
    */
    public static void main(String args[])
    {
        PhoneNo test1 = new PhoneNo("5555551234");
        PhoneNo test2 = new PhoneNo("555", "555", "0010");
        PhoneNo test3 = new PhoneNo();
        test3.setPhoneNo("5551234567");
        System.out.println(test1.getPhoneNo());
        System.out.println(test2.getPhoneNo());
        System.out.println(test3.getPhoneNo());
    }
}

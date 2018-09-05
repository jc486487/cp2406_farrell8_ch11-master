public class IncomingPhoneCall extends PhoneCall
{
    public final static double RATE = 0.02;
    public IncomingPhoneCall(String num)
    {
        super(num);
        price = RATE;
    }

    public void getInfo()
    {
        System.out.println("Incoming phone call " +
                getNumber() + " " + RATE + " per call. Total is $" +
                + getPrice());
    }
    public String getNumber()
    {
        return number;
    }
    public double getPrice()
    {
        return price;
    }
}

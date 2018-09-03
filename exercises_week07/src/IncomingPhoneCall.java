public class IncomingPhoneCall extends PhoneCall
{
    public IncomingPhoneCall(double price)
    {
        super(price);
        getNumber();
        getPrice();
        infoOfCall();
    }

    public String getNumber()
    {
        String num = "2543211";
        return num;
    }

    public double getPrice()
    {
        double price = 0.02;
        return price;
    }

    public String infoOfCall()
    {
        String info = "The call lasted 2 minutes";
        return info;
    }
}

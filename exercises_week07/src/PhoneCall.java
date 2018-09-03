public abstract class PhoneCall
{
    public String number;
    public double price;

    public PhoneCall(double price)
    {
        price = 0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getNumber();
    public abstract double getPrice();
    public abstract String infoOfCall();
}

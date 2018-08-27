public class NonFiction extends Book
{
    public NonFiction()
    {
        super("Non Fiction Book");
        setPrice();
    }

    public void setPrice()
    {
        super.bookPrice = 37.99;
    }
}

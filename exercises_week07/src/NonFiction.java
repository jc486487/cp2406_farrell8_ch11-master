public class NonFiction extends Book
{
    public NonFiction(String title)
    {
        super(title);
        setPrice();
    }

    public void setPrice()
    {
        super.bookPrice = 37.99;
    }
}

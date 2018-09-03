public class Fiction extends Book
{
    Fiction(String title)
    {
        super(title);
        setPrice();
    }

    public void setPrice()
    {
        super.bookPrice = 24.99;
    }
}

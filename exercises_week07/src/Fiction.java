public class Fiction extends Book
{
    public Fiction()
    {
        super("Fiction book");
        setPrice();
    }

    public void setPrice()
    {
        super.bookPrice = 24.99;
    }
}

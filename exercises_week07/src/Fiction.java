import java.util.Scanner;

public class Fiction extends Book
{
    public Fiction(String title)
    {
        super(title);
        setPrice();
    }

    public void setPrice()
    {
        super.bookPrice = 24.99;
    }
}

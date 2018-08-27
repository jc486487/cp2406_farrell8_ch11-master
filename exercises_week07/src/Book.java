public abstract class Book
{
    protected String bookTitle;
    protected double bookPrice;

    public Book(String title)
    {
        bookTitle = title;
    }

    public double getPrice()
    {
        return bookPrice;
    }

    public String getTitle()
    {
        return bookTitle;
    }

    public abstract void setPrice();


}

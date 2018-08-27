public abstract class Book
{
    String bookTitle;
    double bookPrice;

    public Book(String title)
    {
        bookTitle = title;
    }

    public double getBookPrice()
    {
        return bookPrice;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public void setBookPrice(double bookPrice)
    {
        this.bookPrice = bookPrice;
    }
}

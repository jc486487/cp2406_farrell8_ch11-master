public class UseBook
{
    public static void main(String[] args)
    {
        Fiction fic = new Fiction();
        NonFiction nonFic = new NonFiction();

        System.out.println(fic.getBookTitle() + " $" + fic.getBookPrice());
        System.out.println(nonFic.getBookTitle() + " $" + nonFic.getBookPrice());
    }
}

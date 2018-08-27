public class UseBook
{
    public static void main(String[] args)
    {
        Book fic = new Fiction("Harry Potter");
        Book nonFic = new NonFiction("Java Programming");

        System.out.println(fic.getTitle() + " $" + fic.getPrice());
        System.out.println(nonFic.getTitle() + " $" + nonFic.getPrice());
    }
}

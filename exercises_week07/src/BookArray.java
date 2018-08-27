import java.util.Scanner;

public class BookArray
{
    public static void main(String[] args)
    {
        Book[] books = new Book[5];
        populateArray(books);
        displayBooks(books);

    }

    public static void populateArray(Book [] books)
    {
        Scanner input = new Scanner(System.in);
        String type;
        for (int i =0; i < books.length;i++ )
        {
            System.out.println("Enter book title");
            String title = input.nextLine();
            System.out.println("1) Fiction   2) Non- Fiction");
            type = input.nextLine();
            if (type.charAt(0) == '1')
                books[i]= new Fiction(title);
            else if (type.charAt(0) == '2')
                books[i]= new NonFiction(title);
            else
                System.out.println("Invalid choice");
        }
    }

    public static void displayBooks(Book [] books)
    {
        for (int i =0; i < books.length;i++ )
        {
            System.out.println((i+1)+ ".  " + books[i].getTitle() + "     $" + books[i].getPrice());
        }
}
}

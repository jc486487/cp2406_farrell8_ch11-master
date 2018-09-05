public abstract class UseDivision
{
    public static void main(String[] args)
    {
        DomesticDivision abcDomDiv = new
                DomesticDivision("Marketing 1", 546, "California");
        DomesticDivision xyzDomDiv = new
                DomesticDivision("Technology", 284, "Kansas");
        InternationalDivision abcIntDiv = new
                InternationalDivision("Technology 2", 999, "Germany", "German");
        InternationalDivision xyzIntDiv = new
                InternationalDivision("Marketing 3", 284, "Japan",
                "Japanese");
        abcDomDiv.display();
        xyzDomDiv.display();
        abcIntDiv.display();
        xyzIntDiv.display();
    }
}

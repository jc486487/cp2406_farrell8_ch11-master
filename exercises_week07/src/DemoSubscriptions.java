public class DemoSubscriptions
{
    public static void main(String args[])
    {
        PhysicalNewspaperSubscription pnsGood = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription onsGood = new OnlineNewspaperSubscription();
        PhysicalNewspaperSubscription pnsBad = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription onsBad = new OnlineNewspaperSubscription();
        pnsGood.setName("David");
        pnsGood.setAddress("23 Hougang Avenue");
        display(pnsGood);
        pnsBad.setName("Jacob");
        pnsBad.setAddress("Church Street");
        display(pnsBad);
        onsGood.setName("Tagor");
        onsGood.setAddress("tagor@myMail.com");
        display(onsGood);
        onsBad.setName("Joseph");
        onsBad.setAddress("Air Street");
        display(onsBad);
    }
    public static void display(NewspaperSubscription n)
    {
        System.out.println("Name: " + n.getName() + "   Address: " +
                n.getAddress() + "   Rate: " + n.getRate() + "\n");
    }
}


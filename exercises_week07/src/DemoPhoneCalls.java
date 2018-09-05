public class DemoPhoneCalls
{
    public static void main(String[] args)
    {
        IncomingPhoneCall inCall = new IncomingPhoneCall("2123096");
        OutgoingPhoneCall outCall = new OutgoingPhoneCall("3120232", 10);
        inCall.getInfo();
        outCall.getInfo();
    }
}
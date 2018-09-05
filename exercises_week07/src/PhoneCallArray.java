public class PhoneCallArray
{
    public static void main(String[] args)
    {
        PhoneCall calls[] = new PhoneCall[10];
        int i;
        calls[0] = new IncomingPhoneCall("3458372");
        calls[1] = new OutgoingPhoneCall("6448572", 4);
        calls[2] = new IncomingPhoneCall("3433372");
        calls[3] = new OutgoingPhoneCall("6556372", 10);
        calls[4] = new IncomingPhoneCall("5452362");
        calls[5] = new OutgoingPhoneCall("6556372", 30);
        calls[6] = new IncomingPhoneCall("1254857");
        calls[7] = new OutgoingPhoneCall("2351371", 3);
        calls[8] = new IncomingPhoneCall("6448572");
        calls[9] = new OutgoingPhoneCall("9208919", 5);
        for(i = 0; i < calls.length; ++i)
            calls[i].getInfo();
    }
}
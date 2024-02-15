package MyFckingP;

public class Main {

    public static void main(String[] args) {
        Messenger messenger1 = new Telegram(9);
        messenger1.abonents();
        messenger1.writeMessage();
        messenger1.sendMessage();
        messenger1.getMessage();
        messenger1.saveNumber();
        Messenger messenger2 = new Whatsup(344);
        messenger2.writeMessage();
    }
}

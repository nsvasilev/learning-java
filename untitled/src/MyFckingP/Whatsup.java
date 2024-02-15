package MyFckingP;

import java.util.Scanner;

public class Whatsup extends Telegram implements Messenger{


    public Whatsup(long numberOfP) {
        super(numberOfP);
    }

    public void sendMessage() {
        System.out.println("Сообщение отправлено в WhatsApp!");

    }

    @Override
    public void getMessage() {
        System.out.println("Сообщение прочитано в WhatsApp!");
    }

    @Override
    public void abonents() {

            String message = "введите номер контакта";
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            int abonentsInDay = scanner.nextInt();
            System.out.println(abonentsInDay);

    }

    @Override
    public void writeMessage() {
        System.out.println("Дорогой абонент, иди нахуй");

    }

    @Override
    public void saveNumber() {
        System.out.println("Save number to WhatsApp!");
    }
}

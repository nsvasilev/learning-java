package MyFckingP;

import java.util.Scanner;

public  class Telegram implements Messenger {
    private long numberOfP;
    public Telegram (long numberOfP){
        this.numberOfP = numberOfP;

    }
    @Override
    public void saveNumber() {
        System.out.println("Save Number");

    }

    @Override
    public void abonents() {
        String message = "введите номер контакта";
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int abonentsInDay = scanner.nextInt();
        System.out.println(abonentsInDay + "  " + numberOfP);
    }

    @Override
    public void writeMessage() {
        System.out.println("Дорогой абонент, иди нахуй");
    }

    @Override
    public void sendMessage() {
        System.out.println("Сообщение отправлено в Telegram");
    }

    @Override
    public void getMessage() {
        System.out.println("Сообщение прочитано в Telegram");
    }
}






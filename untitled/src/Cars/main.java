package Cars;

public class main {
    public static void main(String[] args) {
        transport bmw = new transport();
        bmw.color = "Black";
        bmw.coordinate = new byte[]{0, 0, 0};
        bmw.speed = 250.0f;
        bmw.weight = 2500;
        String res1 = bmw.getValues();
        System.out.println(res1);

        transport mersedes = new transport();
        mersedes.setValues(220, 2300,"Black", new byte[]{0, 100, 0});

        String res2 = mersedes.getValues();
        System.out.println(res2);


    }
}

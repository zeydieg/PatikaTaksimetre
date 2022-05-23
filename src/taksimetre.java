import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double km, min = 20, acilis = 10, ucret;

        System.out.print("KM'yi giriniz: ");
        km = inp.nextDouble();

        ucret = (acilis + (km * 2.20));
        boolean fiyat = ucret > 20;
        String para = String.valueOf(fiyat ? ucret : min);

        System.out.print("Taksimetre ücreti: " + para);
    }
}

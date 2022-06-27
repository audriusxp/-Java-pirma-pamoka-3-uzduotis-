import java.util.Scanner;

public class uzduotis3 {
    public static void main(String[] args) {
        double a;
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("iveskite krastine A : ");
        a = skaitytuvas.nextDouble();
        System.out.println("krastinesIlgisA = " + a);

        double b;
        Scanner skaitytuvas1 = new Scanner(System.in);
        System.out.println("iveskite krastine B : ");
        b = skaitytuvas1.nextDouble();
        System.out.println("krastinesIlgisB = " + b);

        double c;
        Scanner skaitytuvas2 = new Scanner(System.in);
        System.out.println("iveskite krastine C : ");
        c = skaitytuvas2.nextDouble();
        System.out.println("krastinesIlgisC = " + c);
        System.out.println("GalimasTrikampis(a, b, c) = " + galimasTrikampis(a, b, c));




    }




    public static boolean galimasTrikampis(double a, double b, double c) {
        if (a + b > c) {
            if (b + c > a) {
                if (c + a > b) {
                    System.out.println("true = " + true);
                }

            }
        }
        return false;
    }
}












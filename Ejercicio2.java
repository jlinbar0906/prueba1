import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una temperatura");
        double temp = sc.nextDouble();

        double gradF = 9 / 5 * temp + 32;
        double gradK = temp + 273.15;

        System.out.println("Hacen " + gradF + " en fahrenheit");
        System.out.println("Hacen " + gradK + " en Kelvin");
    }
}

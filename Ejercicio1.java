import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introudzca un numero");
        double a = sc.nextInt();
        System.out.println("Introudzca un numero");
        double b = sc.nextInt();
        System.out.println("Introudzca un numero");
        double c = sc.nextInt();

        double resultado1 = a * b + (3 - c) / 2 * b;
        double resultado2 = Math.pow(((2 + a * b) / 4), (c + 2));
       double resultado3 = (-b + Math.pow((Math.pow(b, 2) - 4 * a * c), -2)) / 2 * a;

        System.out.println(resultado1 + " " + resultado2 + " " + resultado3);
    }
}
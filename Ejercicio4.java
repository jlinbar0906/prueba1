import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num1 = sc.nextInt();
        System.out.println("Introduzca un numero");
        int num2 = sc.nextInt();
        System.out.println("Introduzca un numero");
        int num3 = sc.nextInt();

        int valorMin = num1 < num2 && num1 < num3 ? num1 : num2 < num1 && num2 < num3 ? num2 : num3;
        System.out.println("Valor minimo: " + valorMin);

        int valorMax = num1 > num2 && num1 > num3 ? num1 : num2 > num1 && num2 > num3 ? num2 : num3;
        System.out.println("El valor maximo es " + valorMax);

        int valorMedio = (num1+num2+num3)/3;
        System.out.println("El valor medio es " + valorMedio);

    }
}

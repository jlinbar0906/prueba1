import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Introudzca un numero");
    int a= sc.nextInt();
    System.out.println("Introudzca un numero");
    int b= sc.nextInt();
    System.out.println("Introudzca un numero");
    int c= sc.nextInt();

    int resultado1= a*b+(3-c)/2*b;
    int resultado2= ((2+a*b)/4)^(c+2);
    int resultado3= (int) ((-b+Math.sqrt(b^2-4*a*c))/2*a);

        System.out.println(resultado1 + " " + resultado2 + " " + resultado3);
}
}
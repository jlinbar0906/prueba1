import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas pizzas han pedido");
        int numPizzas = sc.nextInt();
        System.out.println("Cuantos amigos van");
        int numAmigos = sc.nextInt();
        System.out.println("Cuantos trozos tiene cada pizza");
        int porcion = sc.nextInt();

        int porcionTotal = numPizzas * porcion / numAmigos;
        int porcionSobran = numPizzas * porcion % numAmigos;

        System.out.printf("Tocan a %d trozos  y sobran %d", porcionTotal, porcionSobran);

    }
}

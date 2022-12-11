import java.util.Scanner;

public class Atv_02 {
    public static void main(String[] args) {

        double numero;

        System.out.println("Digite um numero:");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextDouble();
        teclado.close();
        System.out.println("O numero digitado foi:");
        System.out.println(numero);
    }
}

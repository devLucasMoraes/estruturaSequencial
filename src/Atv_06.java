import java.util.Scanner;

public class Atv_06 {
    public static void main(String[] args) {
        double raio;
        double area;

        System.out.println("Digite o raio do circulo:");

        Scanner teclado = new Scanner(System.in);
        raio = teclado.nextDouble();

        teclado.close();

        area = Math.PI * Math.pow(raio, 2);

        System.out.println("Area do circulo é: " + area);
    }
}

import java.util.Scanner;

public class Atv_11 {
    public static void main(String[] args) {
        double primeiroInt;
        double segundoInt;
        double terceiroReal;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro");
        primeiroInt = teclado.nextDouble();
        System.out.println("Digite o segundo numero inteiro");
        segundoInt = teclado.nextDouble();
        System.out.println("Digite o terceiro numero real");
        terceiroReal = teclado.nextDouble();

        teclado.close();

        System.out.println("Resposta a)");
        System.out.println((primeiroInt * 2) + (segundoInt/2));
        System.out.println("Resposta b)");
        System.out.println(3 * primeiroInt + terceiroReal);
        System.out.println("Resposta c)");
        System.out.println(Math.pow(terceiroReal, 3));

    }
}

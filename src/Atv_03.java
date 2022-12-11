import java.util.Scanner;

public class Atv_03 {
    public static void main(String[] args) {
        double parcela1;
        double parcela2;
        double resultadoSoma;

        System.out.println("Digite a primeira parcela:");
        Scanner teclado = new Scanner(System.in);
        parcela1 = teclado.nextDouble();

        System.out.println("Digite a segunda parcela:");
        parcela2 = teclado.nextDouble();

        teclado.close();

        resultadoSoma = parcela1 + parcela2;

        System.out.println("seu resultado e:");
        System.out.println(resultadoSoma);

    }
}

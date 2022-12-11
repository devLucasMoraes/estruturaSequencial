import java.util.Scanner;

public class Atv_07 {
    public static void main(String[] args) {
        double lado;
        double area;
        double dobroArea;

        System.out.println("digite o tamanho de um dos lados do quadrado:");
        Scanner teclado = new Scanner(System.in);
        lado = teclado.nextDouble();
        teclado.close();

        area = Math.pow(lado, 2);

        dobroArea = area * 2;

        System.out.println("O dobro da area desse quadrado é: " + dobroArea);


    }
}

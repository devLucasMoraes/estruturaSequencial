import java.util.Scanner;

public class Atv_09 {
    public static void main(String[] args) {
        double temperaturaC;
        double temperaturaF;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em fahrenheit:");
        temperaturaF = teclado.nextDouble();

        teclado.close();

        temperaturaC = 5 * ((temperaturaF-32) / 9);

        System.out.println("A temperatura em celcius é: " + temperaturaC);

    }
}

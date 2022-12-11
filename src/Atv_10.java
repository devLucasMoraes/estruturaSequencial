import java.util.Scanner;

public class Atv_10 {
    public static void main(String[] args) {
        double temperaturaC;
        double temperaturaF;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em celcius:");
        temperaturaC = teclado.nextDouble();

        teclado.close();

        temperaturaF = (temperaturaC * 9/5) + 32;

        System.out.println("A temperatura em fahrenheit é: " + temperaturaF);
    }
}

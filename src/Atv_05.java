import java.util.Scanner;

public class Atv_05 {
    public static void main(String[] args) {
            double numeroEmMT;
            double numeroEmCM;

            System.out.println("Digite a quantidade em MT para ser convertido em CM:");
            Scanner teclado = new Scanner(System.in);
            numeroEmMT = teclado.nextDouble();
            teclado.close();

            numeroEmCM = numeroEmMT * 100;

            System.out.println("A quantidade aferida em CM é:");
            System.out.println(numeroEmCM);




    }
}

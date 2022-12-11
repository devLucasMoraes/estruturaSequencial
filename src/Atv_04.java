import java.util.Scanner;

public class Atv_04 {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        
        double resultadoMedia;

        System.out.println("Digite a sua primeira nota bimestral:");
        Scanner teclado = new Scanner(System.in);
        nota1 = teclado.nextDouble();

        System.out.println("Digite a sua segunda nota bimestral:");
        nota2 = teclado.nextDouble();

        System.out.println("Digite a sua terceira nota bimestral:");
        nota3 = teclado.nextDouble();

        System.out.println("Digite a sua quarta nota bimestral:");
        nota4 = teclado.nextDouble();

        teclado.close();

        resultadoMedia = (nota1 + nota2 + nota3 + nota4) / 4;


        System.out.println("sua media é:");
        System.out.println(resultadoMedia);
    }
}

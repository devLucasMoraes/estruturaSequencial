import java.util.Scanner;

public class Atv_14 {
    public static void main(String[] args) {
        double pesoDoPescado;
        double multaPorKG = 4;
        double multaTotal;
        double excedenteEmKG;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o peso do pescado em kg:");
        pesoDoPescado = teclado.nextDouble();

        teclado.close();

        excedenteEmKG = pesoDoPescado - 50;
        multaTotal = multaPorKG * excedenteEmKG;

        if(pesoDoPescado < 50) {
            System.out.println("Pescado sem excedente");
        } else {
            System.out.println("Peso excedente " + excedenteEmKG + "KG, multa total de: " + multaTotal + " reais.");
        }
    }
}

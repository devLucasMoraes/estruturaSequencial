import java.util.Scanner;

public class Atv_16 {
    public static void main(String[] args) {
        double areaSerPintada;
        double totalDeLatas;
        double precoLata = 80;
        double precoTotal;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tamanho em metros quadrados da área a ser pintada:");
        areaSerPintada = teclado.nextDouble();
        teclado.close();

        totalDeLatas = Math.ceil(areaSerPintada / 54);
        precoTotal = precoLata * totalDeLatas;
        System.out.println("Quantidade de latas a serem compradas: " + totalDeLatas);
        System.out.println("Valor total R$ " + precoTotal);

    }
}

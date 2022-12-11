import java.util.Scanner;

public class Atv_17 {
    public static void main(String[] args) {
        double areaSerPintada;

        double totalDeLatas18LTCeil;
        double totalDeLatas3ponto6LTCeil;
        double totalDeLatas18LT;
        double totalDeLatas18LTFloor;

        double precoLata3ponto6LT = 25;
        double precoLata18LT = 80;

        double areaLata18LT = 108;
        double areaLata3ponto6LT = 21.6;

        double precoTotalLata18LT;
        double precoTotalLata3ponto6LT;
        double precoTotal;

        double sobraDoNumeroInteiroDaLata18LT;
        double areaSerPintadaPelaLata18LT;
        double areaSerPintadaPelaLata3ponto6LT;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tamanho em metros quadrados da área a ser pintada:");
        areaSerPintada = teclado.nextDouble();
        teclado.close();
        
        totalDeLatas18LTCeil = Math.ceil(areaSerPintada / areaLata18LT);
        precoTotalLata18LT = precoLata18LT * totalDeLatas18LTCeil;
        System.out.println("Quantidade de latas a serem compradas com apenas latas de 18 litros: " + totalDeLatas18LTCeil);
        System.out.println("Preço total com apenas latas de 18 litros: R$ " + precoTotalLata18LT);
        System.out.println();
        
        
        totalDeLatas3ponto6LTCeil = Math.ceil(areaSerPintada / areaLata3ponto6LT);
        precoTotalLata3ponto6LT = precoLata3ponto6LT * totalDeLatas3ponto6LTCeil;
        System.out.println("Quantidade de latas a serem compradas com apenas latas de 3,6 litros: " + totalDeLatas3ponto6LTCeil);
        System.out.println("Preço total com apenas latas de 3,6 litros: R$ " + precoTotalLata3ponto6LT);
        System.out.println();


        totalDeLatas18LT = areaSerPintada / areaLata18LT;
        totalDeLatas18LTFloor = Math.floor(totalDeLatas18LT);
        sobraDoNumeroInteiroDaLata18LT = totalDeLatas18LT - totalDeLatas18LTFloor;
        System.out.println(sobraDoNumeroInteiroDaLata18LT);

        if(sobraDoNumeroInteiroDaLata18LT < 0.6) {
            areaSerPintadaPelaLata18LT = areaLata18LT * totalDeLatas18LTFloor;
            areaSerPintadaPelaLata3ponto6LT = areaSerPintada - areaSerPintadaPelaLata18LT;

            totalDeLatas3ponto6LTCeil = Math.ceil(areaSerPintadaPelaLata3ponto6LT / areaLata3ponto6LT);

            precoTotal = totalDeLatas3ponto6LTCeil * precoLata3ponto6LT + totalDeLatas18LTFloor * precoLata18LT;
            System.out.println("Melhor combinacao custo/beneficio é: ");
            System.out.println(Math.floor(totalDeLatas18LT) + " Latas de 18LT");
            System.out.println(Math.floor(totalDeLatas3ponto6LTCeil) + " Latas de 3,6LT");
            System.out.println("Preço total: R$ " + precoTotal);
        } else {
            totalDeLatas18LTCeil = Math.ceil(areaSerPintada / areaLata18LT);
            precoTotalLata18LT = precoLata18LT * totalDeLatas18LTCeil;
            System.out.println("Melhor combinacao custo/beneficio é: ");
            System.out.println(totalDeLatas18LTCeil + " Latas de 18LT");
            System.out.println("Preço total: R$ " + precoTotalLata18LT);
        }

    


        
    }
}

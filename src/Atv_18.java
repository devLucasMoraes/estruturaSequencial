import java.util.Scanner;

public class Atv_18 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Tamanho do arquivo em MB");
        double tamanhoArquivo = teclado.nextDouble();
        System.out.println("Velocidade do link em Mbps");
        double velocidadeLink = teclado.nextDouble();

        teclado.close();

        double tamanhoDoArquivoEmMbts = tamanhoArquivo * 8;
        double tempoDeDownloadInSec = tamanhoDoArquivoEmMbts/velocidadeLink;
        double tempoDeDownloadInMin = tempoDeDownloadInSec / 60;

        System.out.println("Tempo de download aproximado é: " + tempoDeDownloadInMin + " minutos");

    }
}

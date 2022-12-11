import java.util.Scanner;

public class Atv_08 {
    public static void main(String[] args) {
        double valorHora;
        double horasPorMes;
        double salario;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de uma hora trabalhada:");
        valorHora = teclado.nextDouble();

        System.out.println("Digite o número de horas trabalhadas no mês");
        horasPorMes = teclado.nextDouble();

        teclado.close();

        salario = valorHora * horasPorMes;

        System.out.println("Seu salario mensal é: " + salario);


    }
}

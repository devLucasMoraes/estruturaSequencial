import java.util.Scanner;

public class Atv_15 {
    public static void main(String[] args) {
        double valorHora;
        double horasPorMes;
        double salarioBruto;
        double impostoDeRenda;
        double inss;
        double sindicato;
        double salarioLiquido;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de uma hora trabalhada:");
        valorHora = teclado.nextDouble();

        System.out.println("Digite o número de horas trabalhadas no mês");
        horasPorMes = teclado.nextDouble();

        teclado.close();

        salarioBruto = valorHora * horasPorMes;
        impostoDeRenda = salarioBruto * 0.11;
        inss = salarioBruto * 0.0787;
        sindicato = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;
        salarioLiquido = salarioBruto - inss - sindicato;

        
        System.out.println("Salario bruto: R$ " + salarioBruto);
        System.out.println("Imposto de renda: R$" + impostoDeRenda);
        System.out.println("INSS: R$" + inss);
        System.out.println("Sindicato: R$" + sindicato);
        System.out.println("Salario liquido: R$" + salarioLiquido);
    }
}

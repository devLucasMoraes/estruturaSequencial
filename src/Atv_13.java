import java.util.Scanner;

public class Atv_13 {
    public static void main(String[] args) {
        double altura;
        double pesoIdealHomem;
        double pesoIdealMulher;
        String sexo;
    
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua altura");
        altura = teclado.nextDouble();
        System.out.println("Digite seu sexo, 'M' para masculino ou 'F' para feminino :");
        sexo = teclado.next();
    
        teclado.close();
    
        pesoIdealHomem =  (72.7*altura) - 58;
        pesoIdealMulher =  (72.7*altura) - 58;

        if (sexo == "M") {
            System.out.println("Seu peso ideal é: " + pesoIdealHomem + "KG");
        } else {
            System.out.println("Seu peso ideal é: " + pesoIdealMulher + "KG");
        }
    
        
    }
}

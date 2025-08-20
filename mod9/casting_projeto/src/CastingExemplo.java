import java.util.Scanner;

public class CastingExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo um valor do console
        System.out.print("Digite um número decimal: ");
        double valorDouble = scanner.nextDouble();

        // Fazendo o casting de double para int
        int valorInteiro = (int) valorDouble;

        // Exibindo os valores
        System.out.println("Valor original (double): " + valorDouble);
        System.out.println("Valor convertido (int): " + valorInteiro);

        scanner.close();
    }
}

import java.util.Scanner;

public class CastingExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo um valor inteiro (primitivo)
        System.out.print("Digite um número inteiro: ");
        int numeroPrimitivo = scanner.nextInt();

        // Convertendo de primitivo (int) para Wrapper (Integer)
        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        // Exibindo os valores
        System.out.println("Valor primitivo: " + numeroPrimitivo);
        System.out.println("Valor convertido para Wrapper: " + numeroWrapper);

        scanner.close();
    }
}

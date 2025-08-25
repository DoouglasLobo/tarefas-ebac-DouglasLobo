import java.util.Scanner;

public class AvaliacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaNotas = 0.0;
        int quantidadeNotas = 4;

        System.out.println("Digite as 4 notas do aluno:");

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / quantidadeNotas;
        System.out.println("Média do aluno: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno de recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }

        scanner.close();
    }
}

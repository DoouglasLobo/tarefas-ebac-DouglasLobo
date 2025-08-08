// Classe que representa um carro
public class Carro {

    // Atributos (propriedades do carro)
    String marca;
    String modelo;
    int ano;

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    // Método para simular ligar o carro
    public void ligar() {
        System.out.println("O carro está ligado!");
    }

    // Método para simular buzinar
    public void buzinar() {
        System.out.println("Biii Biii!");
    }
}

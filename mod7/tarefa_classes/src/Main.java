public class Main {
    public static void main(String[] args) {

        // Criando um objeto carro
        Carro meuCarro = new Carro();

        // Definindo valores para os atributos
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2020;

        // Chamando os métodos
        meuCarro.exibirInformacoes();
        meuCarro.ligar();
        meuCarro.buzinar();
    }
}

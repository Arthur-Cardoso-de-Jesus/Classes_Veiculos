public class Main {
    public static void main(String[] args) {
        // Cria e configura um carro
        Carro carrinho = new Carro();
        carrinho.marca = "Ford";
        carrinho.modelo = "GT";
        carrinho.setAno(2005);
        carrinho.numeroPortas = 2;

        // Cria e configura uma moto
        Moto motinha = new Moto();
        motinha.marca = "Yamaha";
        motinha.modelo = "MT 300";
        motinha.setAno(2021);
        motinha.setCilindrada(300);

        // Exibe as informações
        System.out.println(carrinho.informacoesVeiculo());
        System.out.println(motinha.informacoesVeiculo());
    }
}
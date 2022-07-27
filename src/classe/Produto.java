package classe;

public class Produto {
    String nome;
    double preço;
    double desconto;

    double precoComDesconto(){
        return preço * (1 - desconto);
    }
    double precoComDesconto(double descontoDoGerente){
        return preço * (1 - desconto + descontoDoGerente);
    }
}

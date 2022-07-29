package classe.MeuProjeto;

public class Custos {
        String nome;
        double preco;
        double desconto;

        Custos(){
        }

        Custos(String nomeInicial, double precoInicial, double descontoInicial){
            nome = nomeInicial;
            preco = precoInicial;
            desconto = descontoInicial;
        }

    public Custos(String gasto_por_dia, double v) {
    }

    double precoComDesconto(){
            return preco * (1 - desconto);
        }
        double precoComDesconto(double descontoDoGerente){
            return preco * (1 - desconto + descontoDoGerente);
    }

}

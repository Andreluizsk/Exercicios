package classe.MeuProjeto;

import classe.desafio.Pessoa;

public class CustosMedio {
    public static void main(String[] args) {
        Custos p1 = new Custos("Cerveja", 35.0, 0.1);
        Custos p2 = new Custos("Cigarro", 9.0, 0.0);
        Custos p3 = new Custos("Marmitex", 17.0, 0.1);
        Custos p4 = new Custos("Gelo", 10.0, 0.0);

        System.out.println("Itens de gastos diarios:");
        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.println(p3.nome);
        System.out.println(p4.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double precoFinal3 = p3.precoComDesconto();
        double precoFinal4 = p4.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3 + precoFinal4) / 4;
        double gastoTotal = (precoFinal1 + precoFinal2 + precoFinal3 + precoFinal4);


        System.out.printf("O gasto medio diário e de = R$%.2f.", mediaCarrinho);
        System.out.printf("\nO gasto diário e = R$%.2f.",  gastoTotal);

    }
}

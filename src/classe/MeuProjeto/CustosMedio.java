package classe.MeuProjeto;

import classe.desafio.Pessoa;

public class CustosMedio {
    public static void main(String[] args) {
        Custos p1 = new Custos("Cerveja", 35.0, 0.1);
        Custos p2 = new Custos("Cigarro", 9.0, 0.0);
        Custos p3 = new Custos("Marmitex", 17.0, 0.1);
        Custos p4 = new Custos("Gelo", 10.0, 0.0);
        Custos p5 = new Custos("Tiouse", 50.0, 0.0);

        System.out.println("Itens de gastos diarios:");
        System.out.println(p1.nome + " - Valor = " + p1.precoComDesconto());
        System.out.println(p1.nome + " - Valor = " + p1.precoComDesconto());
        System.out.println(p2.nome + " - Valor = " + p2.precoComDesconto());
        System.out.println(p3.nome + " - Valor = " + p3.precoComDesconto());
        System.out.println(p4.nome + " - Valor = " + p4.precoComDesconto());
        System.out.println(p5.nome + " - Valor = " + p5.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double precoFinal3 = p3.precoComDesconto();
        double precoFinal4 = p4.precoComDesconto();
        double precoFinal5 = p5.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3 + precoFinal4 + precoFinal5) / 5;
        double gastoTotal = (precoFinal1 + precoFinal2 + precoFinal3 + precoFinal4 + precoFinal5);

        System.out.printf("O gasto medio dos produtos e de = R$%.2f.", mediaCarrinho);
        System.out.printf("\nO gasto diário e = R$%.2f.",  gastoTotal);
    }
}

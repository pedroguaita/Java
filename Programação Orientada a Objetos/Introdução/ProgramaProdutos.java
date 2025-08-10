package introducaopoo;

import entities.Product;
import java.util.Scanner;

public class ProgramaProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product produto;
        produto = new Product();

        System.out.println("Digite as informações do produtos");

        System.out.print("Nome: ");
        produto.nome = sc.nextLine();

        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        produto.quantidade = sc.nextInt();

        //System.out.printf("Informações digitdas: %s, R$%.2f, %d unidades", produto.nome, produto.preco, produto.quantidade);
        System.out.print("Informações digitadas: " + produto);  //-> System.out.println(produto.toString());

        System.out.println("\n\nEntre com a quantidade do produto a ser adicionado ao estoque");
        int quantity = sc.nextInt();
        produto.addProdutos(quantity);

        System.out.println();
        System.out.print("Informações atualizadas: " + produto);

        System.out.println("\n\nEntre com a quantidade do produto a ser removido ao estoque");
        quantity = sc.nextInt();
        produto.removerProdutos(quantity);

        System.out.println();
        System.out.print("Informações atualizadas: " + produto);

        sc.close();
    }
}

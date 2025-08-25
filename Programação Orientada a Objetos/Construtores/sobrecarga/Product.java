package construtores;

import construtores.objects.ObjectProduct;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.println("Digite as informações do produtos");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        //System.out.print("Quantidade em estoque: ");
        //int quantidade = sc.nextInt();

        ObjectProduct product = new ObjectProduct(nome, preco);

        //System.out.printf("Informações digitdas: %s, R$%.2f, %d unidades", produto.nome, produto.preco, produto.quantidade);
        System.out.print("Informações digitadas: " + product);  //-> System.out.println(produto.toString());

        System.out.println("\n\nEntre com a quantidade do produto a ser adicionado ao estoque");
        int quantidade = sc.nextInt();
        product.addProdutos(quantidade);

        System.out.println();
        System.out.print("Informações atualizadas: " + product);

        System.out.println("\n\nEntre com a quantidade do produto a ser removido ao estoque");
        quantidade = sc.nextInt();
        product.removerProdutos(quantidade);

        System.out.println();
        System.out.print("Informações atualizadas: " + product);

        sc.close();
    }
}

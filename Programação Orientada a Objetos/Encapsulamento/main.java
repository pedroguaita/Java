package encapsulamento.main;

import encapsulamento.objects.Product;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as informações do produto");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        Product product = new Product(nome, preco);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());

        System.out.println("Informações digitadas: " + product);

        System.out.println("\nEntre com a quantidade do produto a ser adicionada ao estoque");
        int quantidade = sc.nextInt();
        product.addProdutos(quantidade);
        System.out.println("Informações atualizadas: " + product);

        System.out.println("\nEntre com a quantidade do produto a ser removida do estoque");
        quantidade = sc.nextInt();
        product.removerProdutos(quantidade);
        System.out.println("Informações atualizadas: " + product);

        sc.close();
    }
}

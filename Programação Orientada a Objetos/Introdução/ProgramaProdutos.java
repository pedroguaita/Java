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

        //System.out.printf("Informações digitadas: %s, R$%.2f, %d unidades", produto.nome, produto.preco, produto.quantidade);
        System.out.print("Informações digitadas: " + produto);  //-> System.out.println(produto.toString());

        sc.close();
    }
}

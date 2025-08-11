package entitiesObject;

public class Product {
    //ATRIBUTOS
    public String nome;
    public double preco;
    public int quantidade;

    //MÉTODOS
    public double totalValorEmEstoque(){
        return preco * quantidade;
    }

    public void addProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome
            + ", $ "
            + String.format("%.2f", preco)
            + ", "
            + quantidade
            + " unidades, Total: R$ "
            + String.format("%.2f", totalValorEmEstoque());
    }
}

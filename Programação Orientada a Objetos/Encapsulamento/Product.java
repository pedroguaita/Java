package encapsulamento.objects; //

public class Product {

    private String name;
    private double price;
    private int quantity;

    //Construtor padrão
    public Product() {
    }

    //contrutor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //sobrecarga
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0; // começa sem estoque
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addProdutos(int qtd) {
        this.quantity += qtd;
    }

    public void removerProdutos(int qtd) {
        this.quantity -= qtd;
        if (this.quantity < 0) this.quantity = 0;
    }

    public double totalValue() {
        return price * quantity;
    }


    public String toString() {
        return String.format("%s, R$%.2f, %d unidades, Total: R$%.2f",
                name, price, quantity, totalValue());
    }
}

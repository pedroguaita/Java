package construtores.objects;

public class ObjectProduct {

        //ATRIBUTOS
        public String nome;
        public double preco;
        public int quantidade;

        //Construtor padrão
        public ObjectProduct(){
        }

        //Construtor
        public ObjectProduct(String nome, double preco, int quantidade){
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        //Construtor (Sobrecarga)
        public ObjectProduct(String nome, double preco){
            this.nome = nome;
            this.preco = preco;
            //quantidade = 0;
        }

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


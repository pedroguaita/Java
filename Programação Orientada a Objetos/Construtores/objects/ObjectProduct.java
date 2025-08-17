package construtores.objects;

public class ObjectProduct {

        //ATRIBUTOS
        public String nome;
        public double preco;
        public int quantidade;

        public ObjectProduct(String nome, double preco, int quantidade){
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
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


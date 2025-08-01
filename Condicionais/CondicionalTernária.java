public class CondicionalTernária {
    public static void main(String[] args) {
        float preco = 34.5f;
        float desconto;

        if(preco < 20){
            desconto = (float) (preco * 0.1);
        }
        else{
            desconto = (float) (preco * 0.05);
        }
    }
    
    //OU

    float preco = 34.5f;
    float desconto = (float) ((preco < 20) ? preco * 0.1 : preco * 0.5);

}

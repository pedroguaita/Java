import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        // Obtem o tamanho da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Pega largura e altura
        int largura = (int) screenSize.getWidth();
        int altura = (int) screenSize.getHeight();

        // Imprime a resolução
        System.out.println("A resolução da tela é: " + largura + " x " + altura);
    }
}


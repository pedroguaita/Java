public class TesteTipos {
    public static void main(String[] args) {
       /*
        *  int idade = 30;
        *  String valor = Integer.toString(idade);
        *  System.out.println(valor);
        */

        String valor = "30.5";
        float idade = Float.parseFloat(valor);   //int idade = Integer.parseInt(valor);
        System.out.printf("%.3f", idade);
    }
}



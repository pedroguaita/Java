public class OperadoresAritimeticos {
    public static void main(String[] args) {
        /*
        int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2)/2;
        System.out.printf("A média é igual a %.2f", media);
        */

        int numero = 5;
        numero++;
        int valor = 5 + ++numero; //int valor = 5 + numero++;

        //arredondamentos

        float v = 8.3f;
        //int ar = (int) Math.floor(v);  //floor arredonda para baixo
        //int ar = (int) Math.ceil(v) //ceil arredonda para cima
        int ar = (int) Math.round(v);
        System.out.println(ar);

        //gerador de numeros

        //math.random()

        double aleatorio = Math.random();
        int n = (int) (15 + aleatorio * (50 - 15));
        System.out.println(aleatorio);

        //CASTING
        int a, b;
        float result;

        a = 5;
        b = 2;
        result = (float) a / b;
        System.out.println(result);
    }
}

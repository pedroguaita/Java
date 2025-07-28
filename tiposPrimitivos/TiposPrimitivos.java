public class TiposPrimitivos {
        public static void main(String[] args) {
            String nome = "Pedro";
            float nota = 10.0f;  //float nota = (float)10.0;
            System.out.println("A nota é " + nota);
            System.out.printf("A sua nota, %s, é %.2f", nome, nota);
            System.out.format("...%.1f", nota);
        }
    }

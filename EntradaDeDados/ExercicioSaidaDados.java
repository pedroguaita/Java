import java.util.Locale;

public class ExercicioSaidaDados {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        float price1 = 2100.0f;
        float price2 = 650.50f;
        float measure = 53.234567f;

        System.out.println("Products:");
        System.out.println(product1 + ", which price is $2100.00");
        System.out.println(product2 + ", which price is $650.00");

        System.out.println("\nRecord: " + age + " years old, code " + code + " and gender " + gender);

        System.out.printf("Measure with eight decimal places: %.8f\n", measure);
        System.out.printf("Rouded (Three decimal places): %.3f\n",measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}

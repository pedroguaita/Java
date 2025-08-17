package entitiesObject;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double converter(double dollarprice, double quantity){
        return dollarprice * quantity * (1.0 + IOF);
    }
}

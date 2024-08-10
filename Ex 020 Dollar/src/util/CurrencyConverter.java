package util;

    public class CurrencyConverter {

    public static final double IOF = 1.06;

    public static double Convertion(double cota, double dollar){
        return IOF*cota*dollar;

    }

}

package Hypothec;

public class Hypothec {
    public static void main(String[] args) {
        final int costFlatRub = 1000000;
        final double percentPaymentFlat = 0.435345;
        final double paymentFlatRub = costFlatRub * percentPaymentFlat;

        System.out.println("Первый взнос за квартиру составит " + paymentFlatRub + "Руб.");
    }
}
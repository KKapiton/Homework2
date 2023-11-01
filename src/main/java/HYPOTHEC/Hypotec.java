package HYPOTHEC;

public class Hypotec {
    public static void main(String[] args) {
        final int COST_FLAT_RUB = 1000000;
        final double PERCENT_PAYMENT_FLAT = 0.435345;
        final double PAYMENT_FLAT_RUB = COST_FLAT_RUB * PERCENT_PAYMENT_FLAT;

        System.out.println("Первый взнос за квартиру составит " + PAYMENT_FLAT_RUB + "Руб.");
    }
}
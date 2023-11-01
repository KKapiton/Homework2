package WATER;

public class Water {
    public static void main(String[] args) {
        final int WATER_CUP_ML = 500;
        final double WATER_PERCENT = 0.34;
        final double TOTAL_WATER_ML = WATER_CUP_ML * WATER_PERCENT;

        System.out.println("Емкость заполнена на " + TOTAL_WATER_ML + "мл");
    }
}
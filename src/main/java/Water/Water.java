package Water;

public class Water {
    public static void main(String[] args) {
        final int waterCupMl = 500;
        final double waterPercent = 0.34;
        final double totalWaterMl = waterCupMl * waterPercent;

        System.out.println("Емкость заполнена на " + totalWaterMl + "мл");
    }
}
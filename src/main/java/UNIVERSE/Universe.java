package UNIVERSE;

public class Universe {
    public static void main(String[] args) {
        final long universeAge = 13000000000L;
        final long humanAge = 100000L;
        final long differentAge = universeAge / humanAge;

        System.out.print("Вселенная старше человечества в " + differentAge);
    }
}
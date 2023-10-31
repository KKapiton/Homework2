package HOME_TO_OFFICE;

public class HOME_TO_OFFICE {
    public static void main(String[] args) {
        final int WAY = 100; //расстояние от офиса до дома 100 км
        final float SPEED_TAXI = 68.45f; //скорость такси
        final float TIME_ROAD_TO_OFFICE = WAY / SPEED_TAXI; // время от дома до офиса
        final float TRAFFIC_BAD = 0.34f; //плохой трафик
        final float TIME_ROAD_TO_HOME = TIME_ROAD_TO_OFFICE * TRAFFIC_BAD; //время до дома с плохим трафиком

        System.out.println("Тестировщик едет в офис " + TIME_ROAD_TO_OFFICE + "часов");
        System.out.println("Тестировщик едет домой с плохим трафиком " + TIME_ROAD_TO_HOME + "чаов");
    }
}
package HOME_TO_OFFICE;

public class HomeToOffice {
    public static void main(String[] args) {
        final int Way = 100; //расстояние от офиса до дома 100 км
        final float speedTaxi = 68.45f; //скорость такси
        final float timeRoadToOffice = Way / speedTaxi; // время от дома до офиса
        final float trafficBad = 0.34f; //плохой трафик
        final float timeRoadToHome = timeRoadToOffice + (timeRoadToOffice * trafficBad); //время до дома с плохим трафиком

        System.out.println("Тестировщик едет в офис " + timeRoadToOffice + "часов");
        System.out.println("Тестировщик едет домой с плохим трафиком " + timeRoadToHome + "чаов");
    }
}

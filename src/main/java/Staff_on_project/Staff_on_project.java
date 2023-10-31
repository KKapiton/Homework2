package Staff_on_project;

public class Staff_on_project {
    public static void main(String[] args) {
        final int PROGRAMMERS = 20;
        final int TESTERS_FOR_ONE_PROGRAMMER = 2; //количество тестировщиков для проверки кода 1 программиста
        final int SUPPORTS_FOR_ONE_PROGRAMMER = 4; //количество саппортов для проверки кода 1 программиста
        final int TOTAL_TESTERS = TESTERS_FOR_ONE_PROGRAMMER * PROGRAMMERS; //общее количество тестеров
        final int TOTAL_SUPPORTS = SUPPORTS_FOR_ONE_PROGRAMMER * PROGRAMMERS; //общее количество саппортов
        final int TOTAL_STAFF = TOTAL_TESTERS + TOTAL_SUPPORTS + PROGRAMMERS; //общее количество сотрудников

        System.out.println("Общее количество программистов - " + PROGRAMMERS);
        System.out.println("Общее количество тестеров - " + TOTAL_TESTERS);
        System.out.println("Общее количество саппортов - " + TOTAL_SUPPORTS);
        System.out.println("Общее количество сотрудников - " + TOTAL_STAFF);
    }
}
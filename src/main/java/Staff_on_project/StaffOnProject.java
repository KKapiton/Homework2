package Staff_on_project;

public class StaffOnProject {
    public static void main(String[] args) {
        final int programmers = 20;
        final int testersForOneProgrammer = 2; //количество тестировщиков для проверки кода 1 программиста
        final int supportsForOneProgrammer = 4; //количество саппортов для проверки кода 1 программиста
        final int totalTesters = testersForOneProgrammer * programmers; //общее количество тестеров
        final int totalSupports = supportsForOneProgrammer * programmers; //общее количество саппортов
        final int totalStaff = totalTesters + totalSupports + programmers; //общее количество сотрудников

        System.out.println("Общее количество программистов - " + programmers);
        System.out.println("Общее количество тестеров - " + totalTesters);
        System.out.println("Общее количество саппортов - " + totalSupports);
        System.out.println("Общее количество сотрудников - " + totalStaff);
    }
}
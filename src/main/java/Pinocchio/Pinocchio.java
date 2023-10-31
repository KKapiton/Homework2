package Pinocchio;

public class Pinocchio {
    public static void main(String[] args) {
        final int PINOCCHIO_APPLE = 10;
        final int THEFT_BARABAS = 3;
        final int REMEINS_PINOCCHIO = PINOCCHIO_APPLE - THEFT_BARABAS;

        System.out.println("Изначально яблок у Пиннокио = " + PINOCCHIO_APPLE);
        System.out.println("Украл Карабас Барабас = " + THEFT_BARABAS);
        System.out.println("У Пиннокио осталось яблок после кражи = " + REMEINS_PINOCCHIO);
    }
}
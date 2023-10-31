package SHIRTS;

public class SHIRTS {
    public static void main(String[] args) {
        final int FULL_COST = 1000; //полная цена одной рубашки
        final int LOT_SHIRTS = 5; //количество выбранных рубашек
        final int CONDITION_FOR_DISCOUNT = 10; //нужно 10 рубашек для скидки
        final int LOT_LACK = CONDITION_FOR_DISCOUNT - LOT_SHIRTS; // количество которого не хватает для скидки
        final int COST_LOT_SHIRTS = LOT_SHIRTS * FULL_COST; // цена выбранных рубашек, БЕЗ СКИДКИ
        final int COST_CONDITION_SHIRT = LOT_LACK * FULL_COST; // цена рубашек нужных ДЛЯ СКИДКИ
        final double PERCENT_DISCOUNT = 0.45d; // % скидки
        final double ALL_COST_DISCOUNT = (CONDITION_FOR_DISCOUNT * FULL_COST) - (CONDITION_FOR_DISCOUNT * FULL_COST * PERCENT_DISCOUNT); // цена всех рубашек со скидкой
        final double COST_ONE_SHIRT_DISCOUNT = FULL_COST - (FULL_COST * PERCENT_DISCOUNT); // цена одной рубашки со скидкой
        final double LOT_SAVE_MONEY = (FULL_COST * CONDITION_FOR_DISCOUNT) - ALL_COST_DISCOUNT; // сэкономленные деньги со всех рубашек
        final double FREE_SHIRT = LOT_SAVE_MONEY / FULL_COST; // ХАЛЯВА

        System.out.println("Цена выбранных рубашек БЕЗ СКИДКИ = " + COST_LOT_SHIRTS);
        System.out.println("Общая цена рубашек, нужных для скидки = " + COST_CONDITION_SHIRT);
        System.out.println("Цена всех рубашек со скидкой = " + ALL_COST_DISCOUNT);
        System.out.println("Цена одной рубашки со скидкой = " + COST_ONE_SHIRT_DISCOUNT);
        System.out.println("Сэкономленные деньги с покупки со скидкой = " + LOT_SAVE_MONEY);
        System.out.println("Полученные на халяву рубашки = " + FREE_SHIRT);
    }
}
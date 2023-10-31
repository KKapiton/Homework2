package SHIRTS;

public class SHIRTS {
    public static void main(String[] args) {
        final int FULL_COST_SHIRT = 500; //полная цена рубашки
        final int LOT_SHIRTS = 5; //количество выбранных рубашек
        final int CONDITION_FOR_DISCOUNT = 10; //нужно 10 рубашек для скидки
        final int LOT_LACK = CONDITION_FOR_DISCOUNT - LOT_SHIRTS; // количество которого не хватает для скидки
        final int COST_LOT_SHIRTS = LOT_SHIRTS * FULL_COST_SHIRT; // цена выбранных рубашек, БЕЗ СКИДКИ
        final int COST_CONDITION_SHIRT = LOT_LACK * FULL_COST_SHIRT; // цена недостоющего количества рубашек ДЛЯ СКИДКИ

        final float PERCENT_DISCOUNT = 0.35f; // % скидки
        final float ALL_COST_DISCOUNT = (COST_LOT_SHIRTS + COST_CONDITION_SHIRT) * PERCENT_DISCOUNT; // цена всех рубашек со скидкой
        final float COST_ONE_SHIRT_DISCOUNT = FULL_COST_SHIRT * PERCENT_DISCOUNT; // цена одной рубашки со скидкой
        final float LOT_SAVE_MONEY = FULL_COST_SHIRT * CONDITION_FOR_DISCOUNT - (ALL_COST_DISCOUNT * CONDITION_FOR_DISCOUNT);

        System.out.println("Цена всех рубах со скидкой = " + ALL_COST_DISCOUNT);
        System.out.println("Цена одной рубашки со скидкой = " + COST_ONE_SHIRT_DISCOUNT);
        System.out.println("сэкономленные деньги с покупки со скидкой = " + LOT_SAVE_MONEY);
    }
}
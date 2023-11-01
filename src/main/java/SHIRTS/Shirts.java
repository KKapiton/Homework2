package SHIRTS;

public class Shirts {
    public static void main(String[] args) {
        final int fullCost = 1000; //полная цена одной рубашки
        final int lotShirts = 5; //количество выбранных рубашек
        final int conditionForDiscount = 10; //нужно 10 рубашек для скидки
        final int lotLack = conditionForDiscount - lotShirts; // количество которого не хватает для скидки
        final int costLotShirts = lotShirts * fullCost; // цена выбранных рубашек, БЕЗ СКИДКИ
        final int costConditionShirt = lotLack * fullCost; // цена рубашек нужных ДЛЯ СКИДКИ

        final double percentDiscount = 0.45d; // % скидки
        final double allCostDiscount = (conditionForDiscount * fullCost) - (conditionForDiscount * fullCost * percentDiscount); // цена всех рубашек со скидкой
        final double costOneShirtDiscount = fullCost - (fullCost * percentDiscount); // цена одной рубашки со скидкой
        final double lotSaveMoney = (fullCost * conditionForDiscount) - allCostDiscount; // сэкономленные деньги со всех рубашек
        final double freeShirt = lotSaveMoney / fullCost; // ХАЛЯВА

        System.out.println("Цена выбранных рубашек БЕЗ СКИДКИ = " + costLotShirts);
        System.out.println("Общая цена рубашек, нужных для скидки = " + costConditionShirt);
        System.out.println("Цена всех рубашек со скидкой = " + allCostDiscount);
        System.out.println("Цена одной рубашки со скидкой = " + costOneShirtDiscount);
        System.out.println("Сэкономленные деньги с покупки со скидкой = " + lotSaveMoney);
        System.out.println("Полученные на халяву рубашки = " + freeShirt);
    }
}
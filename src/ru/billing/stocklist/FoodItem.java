package ru.billing.stocklist;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class FoodItem extends GenericItem { // наследуем класс ru.billing.stocklist.FoodItem от класса ru.billing.stocklist.GenericItem

    private short expires; // срок годности
    private GregorianCalendar dateOfIncome; // дата производства через Календарь

    private SimpleDateFormat dateFormat = new SimpleDateFormat(" dd MMMM yyyy"); // формат даты

    // конструктор №1
    public FoodItem(String tempName, float tempPrice, FoodItem tempAnalog, GregorianCalendar tempDateOfIncome, short tempExpires) {
        this(tempName, tempPrice, tempExpires); // получаем значения от конструктора №2
        analog = tempAnalog;
        dateOfIncome = tempDateOfIncome;
    }

    // констуруктор №2
    public FoodItem(String tempName, float tempPrice, short tempExpires) {
        this(tempName); // получаем значения от конструктора №3
        price = tempPrice;
        expires = tempExpires;
    }

    // конструктор №3
    public FoodItem(String tempName) {
        name = tempName;
    }

    public short getExpires() {
        return expires;
    }

    public void printAll() {
        System.out.println("*****");
        System.out.println(" ---Name: " + getName() + " ---Price: " + getPrice()
                + " ---Expires: " + expires + " days");
    }

    public GregorianCalendar getDateOfIncome() {
        return dateOfIncome;
    }
}

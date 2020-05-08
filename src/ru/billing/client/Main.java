package ru.billing.client;

import ru.billing.stocklist.Category;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // товары
        GenericItem item1 = new GenericItem("book", 70.70f, Category.PRINT);
        GenericItem item2 = new GenericItem("newBook", 220.20f, Category.PRINT);
        GenericItem item3 = new GenericItem("dress", 8080.80f, Category.DRESS);
        GenericItem item4 = new GenericItem("newDress", 2000.00f, Category.DRESS);
        GenericItem item5 = new GenericItem("glass", 110.10f, Category.GENERAL);
        GenericItem item6 = new GenericItem("newGlass", 330.30f, Category.GENERAL);
        GenericItem item7 = new GenericItem("milk", 50.50f, Category.FOOD);
        GenericItem item8 = new GenericItem("newMilk", 150.50f, Category.FOOD);
        GenericItem item9 = new GenericItem("phone", 3330.30f, Category.GENERAL);
        GenericItem item10 = new GenericItem("newPhone", 30000.00f, Category.GENERAL);

        // новый каталог
        ItemCatalog newCatalog = new ItemCatalog();

        // добавление товаров в каталог
        newCatalog.addItem(item1);
        newCatalog.addItem(item2);
        newCatalog.addItem(item3);
        newCatalog.addItem(item4);
        newCatalog.addItem(item5);
        newCatalog.addItem(item6);
        newCatalog.addItem(item7);
        newCatalog.addItem(item8);
        newCatalog.addItem(item9);
        newCatalog.addItem(item10);

        newCatalog.printItems();

        long begin = new Date().getTime();

        for (int i = 0; i < 100000; i++) {
            newCatalog.findItemByID(10);
        }
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin));
        begin = new Date().getTime();
        for (int i = 0; i < 100000; i++) {
            newCatalog.findItemByIDAL(10);
        }
        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));

        // загружаем товары в каталог с помощью объекта-загрузчика
        CatalogLoader loader = new CatalogStubLoader();
        loader.load(newCatalog);

        newCatalog.printItems();
    }
}

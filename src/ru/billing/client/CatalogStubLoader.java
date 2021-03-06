package ru.billing.client;

import ru.billing.stocklist.Category;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;
import ru.billing.stocklist.FoodItem;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CatalogStubLoader implements CatalogLoader {

    @Override
    public void load(ItemCatalog cat) {
        // "ручной" способ загрузки каталога
        GenericItem one = new GenericItem("Sony TV", 23000f, Category.GENERAL);
        FoodItem two = new FoodItem("Bread", 12f, null,
                new GregorianCalendar(2020, Calendar.MAY, 1), (short) 10);
        cat.addItem(one);
        cat.addItem(two);
    }
}

package ru.billing.stocklist;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {
    // данная коллекция оптимальна для последующего поиска товаров в каталоге
    private HashMap<Integer, GenericItem> catalog = new HashMap<Integer, GenericItem>();
    // следующая коллекция нужна для сравнения с предыдущей
    private ArrayList<GenericItem> arrayCatalog = new ArrayList<GenericItem>();

    // добавляем товар в каталог
    public void addItem(GenericItem item) {
        catalog.put(item.getId(), item); // добавляем товар в HashMap
        arrayCatalog.add(item); // добавляем тот же товар в ArrayList
    }

    // распечатываем товар из каталога на экран
    public void printItems() {
        for (GenericItem i : arrayCatalog) {
            System.out.println(i.toString());
        }
    }

    // поиск в каталоге по ID
    public GenericItem findItemByID(int id) {
        // если нет такого ID, возвращаем пустое значение
        if (!catalog.containsKey(id)) {
            return null;
        } else {
            return catalog.get(id);
        }
    }

    // поиск в каталоге по ID
    public GenericItem findItemByIDAL(int id) {
        for (GenericItem i : arrayCatalog) {
            if (i.id == id) {
                return i;
            }
        }
        return null;
    }

    public HashMap<Integer, GenericItem> getHashMap() {
        return catalog;
    }

    public ArrayList<GenericItem> getArrayList() {
        return arrayCatalog;
    }
}

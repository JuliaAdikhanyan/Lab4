package ru.billing.stocklist;

import ru.billing.client.CatalogLoader;

import java.util.*;

public class ItemCatalog {
    // данная коллекция оптимальна для последующего поиска товаров в каталоге
    private Map<Integer, GenericItem> catalog = new HashMap<>();
    // следующая коллекция нужна для сравнения с предыдущей
    private List<GenericItem> arrayCatalog = new ArrayList<>();

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
        return catalog.getOrDefault(id, null);
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

    public Map<Integer, GenericItem> getHashMap() {
        return catalog;
    }

    public List<GenericItem> getArrayList() {
        return arrayCatalog;
    }
}

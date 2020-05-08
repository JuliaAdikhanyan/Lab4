package ru.billing.stocklist;

public class TechnicalItem extends GenericItem {

    private short warrantyTime; // гарантийный срок товара

    TechnicalItem(String tempName, float tempPrice, TechnicalItem tempAnalog, short tempWarrantyTime) {
        super(tempName, tempPrice, tempAnalog);
        warrantyTime = tempWarrantyTime;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString() + " ---WarrantyTime: " + warrantyTime + " days";
    }

    public void printAll() {
        System.out.println("*****");
        System.out.println("---ID: " + getId() + " ---Name: " + getName() + " ---Price: " + getPrice() + " ---Analog: "
                + getAnalog().getName() + " ---Category: " + getCategory() + " ---WarrantyTime: " + warrantyTime + " days");
    }

    public short getWarrantyTime() {
        return warrantyTime;
    }
}


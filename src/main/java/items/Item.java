package items;

import behaviours.ISell;

public abstract class Item implements ISell {
    private String itemDescription;
    private double buyPrice;
    private double sellPrice;

    public Item(String itemDescription, double buyPrice, double sellPrice) {
        this.itemDescription = itemDescription;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkup() {
        double markUp = this.sellPrice-this.buyPrice;
        return markUp;
    }
}

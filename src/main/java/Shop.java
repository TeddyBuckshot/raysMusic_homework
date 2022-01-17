import items.Item;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<Item> getStock() {
        return stock;
    }

    public Item addStock(Item item){
        this.stock.add(item);
        return item;
    }

    public Item removeStock(Item item){
        this.stock.remove(item);
        return item;
    }

    public double potentialProfit(){
        double total = 0;
        for (Item item: stock){
            total += item.calculateMarkup();
        }
        return total;
    }

}

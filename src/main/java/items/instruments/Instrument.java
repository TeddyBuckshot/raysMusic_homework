package items.instruments;

import behaviours.IPlay;
import items.Item;

public abstract class Instrument extends Item implements IPlay {
    private instrumentType type;
    private String colour;


    public Instrument(String itemDescription, double buyPrice, double sellPrice, instrumentType type, String colour) {
        super(itemDescription, buyPrice, sellPrice);
        this.type = type;
        this.colour = colour;
    }

    public instrumentType getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public abstract String playInstrument();
}

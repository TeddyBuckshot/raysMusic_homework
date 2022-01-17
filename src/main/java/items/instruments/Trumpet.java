package items.instruments;

public class Trumpet extends Instrument{
    public Trumpet(String itemDescription, double buyPrice, double sellPrice, instrumentType type, String colour) {
        super(itemDescription, buyPrice, sellPrice, type, colour);
    }

    @Override
    public String playInstrument() {
        return "toot toot toot";
    }
}

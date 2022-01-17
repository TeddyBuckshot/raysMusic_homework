package items.instruments;

public class Piano extends Instrument{
    public Piano(String itemDescription, double buyPrice, double sellPrice, instrumentType type, String colour) {
        super(itemDescription, buyPrice, sellPrice, type, colour);
    }

    @Override
    public String playInstrument() {
        return "what a wonderful rendition of Beethoven's Piano Concerto No. 5!";
    }
}

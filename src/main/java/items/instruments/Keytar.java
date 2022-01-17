package items.instruments;

public class Keytar extends Instrument{
    public Keytar(String itemDescription, double buyPrice, double sellPrice, instrumentType type, String colour) {
        super(itemDescription, buyPrice, sellPrice, type, colour);
    }

    @Override
    public String playInstrument() {
        return "The 80's called, they want their keyboard back...";
    }
}

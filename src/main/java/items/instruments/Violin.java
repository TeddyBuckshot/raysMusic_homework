package items.instruments;

public class Violin extends Instrument{
    public Violin(String itemDescription, double buyPrice, double sellPrice, instrumentType type, String colour) {
        super(itemDescription, buyPrice, sellPrice, type, colour);
    }

    @Override
    public String playInstrument() {
        return "you hear the melody to cotton eye'd joe, faintly";
    }
}

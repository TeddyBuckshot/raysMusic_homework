package items.instruments;

public class Synthesizer extends Instrument{
    public Synthesizer(String itemDescription, double buyPrice, double sellPrice, instrumentType type, String colour) {
        super(itemDescription, buyPrice, sellPrice, type, colour);
    }

    @Override
    public String playInstrument() {
        return "beep boop";
    }
}

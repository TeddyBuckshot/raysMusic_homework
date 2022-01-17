package items.instruments;

public class Guitar extends Instrument{
    private int noOfPickUps;
    private int noOfStrings;
    private boolean isAcoustic;

    public Guitar(String itemDescription, double buyPrice, double sellPrice, instrumentType type, String colour, int noOfPickUps, int noOfStrings, boolean isAcoustic) {
        super(itemDescription, buyPrice, sellPrice, type, colour);
        this.noOfPickUps = noOfPickUps;
        this.noOfStrings = noOfStrings;
        this.isAcoustic = false;
    }

    public int getNoOfPickUps() {
        return noOfPickUps;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public boolean isAcoustic() {
        return isAcoustic;
    }

    @Override
    public String playInstrument() {
        return "Sir, stairway to heaven is on our ban list.";
    }
}

package items.instruments;

public class Drumkit extends Instrument{
    private int noOfToms;
    private int noOfCymbals;
    private int totalNoOfDrums;

    public Drumkit(String itemDescription, double buyPrice, double sellPrice, instrumentType type, String colour, int noOfToms, int noOfCymbals, int totalNoOfDrums) {
        super(itemDescription, buyPrice, sellPrice, type, colour);
        this.noOfToms = noOfToms;
        this.noOfCymbals = noOfCymbals;
        this.totalNoOfDrums = totalNoOfDrums;
    }

    public int getNoOfToms() {
        return noOfToms;
    }

    public int getNoOfCymbals() {
        return noOfCymbals;
    }

    public int getTotalNoOfDrums() {
        return totalNoOfDrums;
    }

    @Override
    public String playInstrument() {
        return "ba dum dum, tiss";
    }
}

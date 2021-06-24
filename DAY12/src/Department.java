import java.util.ArrayList;

public class Department< T extends Instrument> {
    private String name;
    private int numberOfInstruments = 0;
    private ArrayList<T> instruments = new ArrayList<>();


    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfInstruments() {
        return numberOfInstruments;
    }

    public void addInstruments(T instrument) {

        instruments.add(instrument);
        numberOfInstruments++;
        System.out.println(instrument.getName() + " added to " + name);




    }

}

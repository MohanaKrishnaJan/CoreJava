package Day03;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar();
        instruments[1] = new Piano();
        instruments[2] = new Violin();

        for (Instrument instrument : instruments) {
            instrument.play(); // Invokes the overridden method specific to each instrument
        }
    }
}
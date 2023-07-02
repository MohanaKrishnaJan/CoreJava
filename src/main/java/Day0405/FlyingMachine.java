package Day0405;

public class FlyingMachine implements Birds, Insects{
    @Override
    public int fly(int wings) {
        return wings;
    }

    @Override
    public void sound(String sound){
        System.out.println("I fly with "+sound+" noise");
    }
}

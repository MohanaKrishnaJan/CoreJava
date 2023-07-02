package Day03;

abstract class Instrument {
    abstract void play();
}

class Guitar extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the guitar");
    }
}

class Piano extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the piano");
    }
}

class Violin extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the violin");
    }
}



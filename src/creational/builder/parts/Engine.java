package creational.builder.parts;

public class Engine {

    private int volume;

    public Engine(int volume) {
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }
}

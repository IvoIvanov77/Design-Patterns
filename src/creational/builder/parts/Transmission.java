package creational.builder.parts;

public class Transmission {

    private TransmissionType type;

    public Transmission(TransmissionType type) {
        this.type = type;
    }

    public TransmissionType getType() {
        return this.type;
    }
}

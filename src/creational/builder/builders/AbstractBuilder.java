package creational.builder.builders;

import creational.builder.Builder;
import creational.builder.parts.Engine;
import creational.builder.parts.GPSNavigator;
import creational.builder.parts.Transmission;
import creational.builder.parts.TripComputer;
import creational.builder.products.CarType;

abstract class AbstractBuilder implements Builder {
    protected CarType carType;
    protected int seats;
    protected Engine engine;
    protected Transmission transmission;
    protected TripComputer tripComputer;
    protected GPSNavigator gpsNavigator;

    @Override
    public Builder setCarType(CarType type) {
        this.carType = type;
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public Builder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    void reset() {
        this.carType = null;
        this.engine = null;
        this.gpsNavigator = null;
        this.transmission = null;
        this.tripComputer = null;
        this.seats = 0;
    }
}

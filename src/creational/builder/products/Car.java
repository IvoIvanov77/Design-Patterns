package creational.builder.products;

import creational.builder.parts.Engine;
import creational.builder.parts.GPSNavigator;
import creational.builder.parts.Transmission;
import creational.builder.parts.TripComputer;

public class Car extends CarFactoryProduct {
    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
        GPSNavigator gpsNavigator) {
        super(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }

    public CarType getCarType() {
        return carType;
    }
}

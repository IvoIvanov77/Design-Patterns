package creational.builder.products;

import creational.builder.parts.Engine;
import creational.builder.parts.GPSNavigator;
import creational.builder.parts.Transmission;
import creational.builder.parts.TripComputer;

public abstract class CarFactoryProduct {
    CarType carType;
    int seats;
    Engine engine;
    Transmission transmission;
    TripComputer tripComputer;
    GPSNavigator gpsNavigator;

    CarFactoryProduct(CarType carType, int seats, Engine engine, Transmission transmission,
                      TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }
}

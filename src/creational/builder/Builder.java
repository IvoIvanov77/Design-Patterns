package creational.builder;

import creational.builder.parts.Engine;
import creational.builder.parts.GPSNavigator;
import creational.builder.parts.Transmission;
import creational.builder.parts.TripComputer;
import creational.builder.products.CarFactoryProduct;
import creational.builder.products.CarType;

public interface Builder {
    Builder setCarType(CarType type);
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setTripComputer(TripComputer tripComputer);
    Builder setGPSNavigator(GPSNavigator gpsNavigator);
    CarFactoryProduct build();
}

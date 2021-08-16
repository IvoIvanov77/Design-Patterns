package creational.builder.products;

import creational.builder.parts.Engine;
import creational.builder.parts.GPSNavigator;
import creational.builder.parts.Transmission;
import creational.builder.parts.TripComputer;


public class Manual extends CarFactoryProduct {

    public Manual(
            CarType carType,
            int seats,
            Engine engine,
            Transmission transmission,
            TripComputer tripComputer,
            GPSNavigator gpsNavigator
    ) {
        super(carType, seats, engine, transmission, tripComputer, gpsNavigator);

    }

    public String getCarInfo() {
        return String.format(
                "Car type: %s%n" +
                        "Seats: %d%n" +
                        "Engine: %d%n" +
                        "Transmission: %s%n" +
                        "Trip Computer screen size: %d%n" +
                        "GPSNavigator: %s%n",
                carType, seats, engine.getVolume(), transmission.getType(),
                tripComputer.getScreenSize(), gpsNavigator.getModel());
    }
}

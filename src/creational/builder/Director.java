package creational.builder;

import creational.builder.parts.*;
import creational.builder.products.CarType;

public class Director {

    public static void createSportCar(Builder builder) {
        builder
                .setCarType(CarType.SPORTS_CAR)
                .setEngine(new Engine(3000))
                .setSeats(2)
                .setGPSNavigator(new GPSNavigator("Garmin"))
                .setTransmission(new Transmission(TransmissionType.MANUAL))
                .setTripComputer(new TripComputer(8));
    }
}

package creational.builder.builders;

import creational.builder.products.Car;

public class CarBuilder extends AbstractBuilder {
    private static CarBuilder instance;

    private CarBuilder() {}

    public static CarBuilder getInstance() {
        if(instance == null) {
            instance = new CarBuilder();
        }
        instance.reset();
        return instance;
    }


    @Override
    public Car build() {
        Car car = new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
        super.reset();
        return car;
    }
}

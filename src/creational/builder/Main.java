package creational.builder;

import creational.builder.builders.CarBuilder;
import creational.builder.builders.ManualBuilder;
import creational.builder.products.Car;
import creational.builder.products.CarType;
import creational.builder.products.Manual;

public class Main {

    public static void main(String[] args) {
        CarBuilder carBuilder = CarBuilder.getInstance();
        ManualBuilder manualBuilder = ManualBuilder.getInstance();
        Director.createSportCar(carBuilder);
        Director.createSportCar(manualBuilder);
        Car car = carBuilder.build();
        Manual manual = manualBuilder.build();

        System.out.println(car.getCarType());
        System.out.println(manual.getCarInfo());
    }
}

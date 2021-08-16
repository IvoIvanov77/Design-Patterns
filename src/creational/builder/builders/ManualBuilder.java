package creational.builder.builders;

import creational.builder.products.Manual;

public class ManualBuilder extends AbstractBuilder {
    private static ManualBuilder instance;

    private ManualBuilder() {}

    public static  ManualBuilder getInstance() {
        if(instance == null) {
            instance = new ManualBuilder();
        }
        instance.reset();
        return instance;
    }

    @Override
    public Manual build() {
        Manual manual = new Manual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
        super.reset();
        return manual;
    }
}

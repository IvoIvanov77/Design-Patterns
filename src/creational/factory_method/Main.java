package creational.factory_method;

import creational.factory_method.logistics.RoadLogistic;
import creational.factory_method.logistics.SeaLogistic;

public class Main {

    public static void main(String[] args) {
        SeaLogistic.getInstance().makeDelivery();
        RoadLogistic.getInstance().makeDelivery();
    }
}

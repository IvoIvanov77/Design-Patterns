package creational.factory_method.logistics;

import creational.factory_method.Transport;
import creational.factory_method.transports.Truck;

public class RoadLogistic extends AbstractLogistic {

    private static RoadLogistic instance;

    private  RoadLogistic() {}

    public static RoadLogistic getInstance() {
        if(instance == null) {
            instance = new RoadLogistic();
        }
        return instance;
    }

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

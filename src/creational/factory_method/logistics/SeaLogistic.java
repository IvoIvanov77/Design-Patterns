package creational.factory_method.logistics;

import creational.factory_method.Transport;
import creational.factory_method.transports.Ship;
import creational.factory_method.transports.Truck;

public class SeaLogistic extends AbstractLogistic {

    private static SeaLogistic instance;

    private  SeaLogistic() {}

    public static SeaLogistic getInstance() {
        if(instance == null) {
            instance = new SeaLogistic();
        }
        return instance;
    }

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

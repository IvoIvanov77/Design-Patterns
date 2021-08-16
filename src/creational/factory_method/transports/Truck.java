package creational.factory_method.transports;

import creational.factory_method.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Truck delivery");
    }
}

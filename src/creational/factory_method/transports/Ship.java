package creational.factory_method.transports;

import creational.factory_method.Transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship delivery");
    }
}

package creational.factory_method.logistics;

import creational.factory_method.Logistic;
import creational.factory_method.Transport;
import creational.factory_method.transports.Truck;

public abstract class AbstractLogistic implements Logistic {
    @Override
    public void makeDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

}

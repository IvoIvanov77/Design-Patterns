package creational.abstract_factory;

import creational.abstract_factory.factories.ArtDecoFurnitureFactory;
import creational.abstract_factory.factories.MinimalisticFurnitureFactory;
import creational.abstract_factory.factories.ModernFurnitureFactory;
import creational.abstract_factory.factories.VictorianFurnitureFactory;

public class Main {

    public static void main(String[] args) {
        Chair artDecoChair = ArtDecoFurnitureFactory.getInstance().createChair();
        artDecoChair.sitOn();

        Sofa modernSofa = ModernFurnitureFactory.getInstance().createSofa();
        modernSofa.watchTv();

        testFactory(VictorianFurnitureFactory.getInstance());
        testFactory(MinimalisticFurnitureFactory.getInstance());

    }

    public static void testFactory(FurnitureFactory factory) {
        FurnitureClient client = new FurnitureClient(factory);
        Chair chair = client.getChair();
        CoffeeTable table = client.getCoffeeTable();
        Sofa sofa = client.getSofa();

        chair.sitOn();
        table.drinkCoffee();
        sofa.watchTv();
    }
}

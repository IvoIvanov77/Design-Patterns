package creational.abstract_factory.factories;

import creational.abstract_factory.Chair;
import creational.abstract_factory.CoffeeTable;
import creational.abstract_factory.FurnitureFactory;
import creational.abstract_factory.Sofa;
import creational.abstract_factory.furnitures.chairs.VictorianChair;
import creational.abstract_factory.furnitures.coffee_tables.VictorianCoffeeTable;
import creational.abstract_factory.furnitures.sofas.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {

    private static VictorianFurnitureFactory instance;

    private VictorianFurnitureFactory() {}

    public static VictorianFurnitureFactory getInstance() {
        if(instance == null) {
            instance = new VictorianFurnitureFactory();
        }
        return instance;
    }
    
    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}

package creational.abstract_factory.factories;

import creational.abstract_factory.Chair;
import creational.abstract_factory.CoffeeTable;
import creational.abstract_factory.FurnitureFactory;
import creational.abstract_factory.Sofa;
import creational.abstract_factory.furnitures.chairs.MinimalisticChair;
import creational.abstract_factory.furnitures.chairs.VictorianChair;
import creational.abstract_factory.furnitures.coffee_tables.MinimalisticCoffeeTable;
import creational.abstract_factory.furnitures.coffee_tables.VictorianCoffeeTable;
import creational.abstract_factory.furnitures.sofas.MinimalisticSofa;
import creational.abstract_factory.furnitures.sofas.VictorianSofa;

public class MinimalisticFurnitureFactory implements FurnitureFactory {

    private static MinimalisticFurnitureFactory instance;

    private MinimalisticFurnitureFactory() {}

    public static MinimalisticFurnitureFactory getInstance() {
        if(instance == null) {
            instance = new MinimalisticFurnitureFactory();
        }
        return instance;
    }
    
    @Override
    public Sofa createSofa() {
        return new MinimalisticSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new MinimalisticCoffeeTable();
    }

    @Override
    public Chair createChair() {
        return new MinimalisticChair();
    }
}

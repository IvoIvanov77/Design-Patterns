package creational.abstract_factory.factories;

import creational.abstract_factory.Chair;
import creational.abstract_factory.CoffeeTable;
import creational.abstract_factory.FurnitureFactory;
import creational.abstract_factory.Sofa;
import creational.abstract_factory.furnitures.chairs.ModernChair;
import creational.abstract_factory.furnitures.coffee_tables.ModernCoffeeTable;
import creational.abstract_factory.furnitures.sofas.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {

    private static ModernFurnitureFactory instance;

    private ModernFurnitureFactory() {}

    public static ModernFurnitureFactory getInstance() {
        if(instance == null) {
            instance = new ModernFurnitureFactory();
        }
        return instance;
    }
    
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}

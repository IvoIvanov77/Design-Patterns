package creational.abstract_factory.factories;

import creational.abstract_factory.Chair;
import creational.abstract_factory.CoffeeTable;
import creational.abstract_factory.FurnitureFactory;
import creational.abstract_factory.Sofa;
import creational.abstract_factory.furnitures.chairs.ArtDecoChair;
import creational.abstract_factory.furnitures.coffee_tables.ArtDecoCoffeeTable;
import creational.abstract_factory.furnitures.sofas.ArtDecoSofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

    private static ArtDecoFurnitureFactory instance;

    private ArtDecoFurnitureFactory() {}

    public static ArtDecoFurnitureFactory getInstance() {
        if(instance == null) {
            instance = new ArtDecoFurnitureFactory();
        }
        return instance;
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }
}

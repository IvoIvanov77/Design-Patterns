package creational.abstract_factory;

import creational.abstract_factory.factories.ArtDecoFurnitureFactory;
import creational.abstract_factory.factories.ModernFurnitureFactory;

public class Main {

    public static void main(String[] args) {
        Chair artDecoChair = ArtDecoFurnitureFactory.getInstance().createChair();
        artDecoChair.sitOn();

        Sofa modernSofa = ModernFurnitureFactory.getInstance().createSofa();
        modernSofa.eat();
    }
}

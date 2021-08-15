package creational.abstract_factory;

public class FurnitureClient {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public FurnitureClient(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.coffeeTable = factory.createCoffeeTable();
        this.sofa = factory.createSofa();
    }

    public Chair getChair() {
        return chair;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public CoffeeTable getCoffeeTable() {
        return coffeeTable;
    }
}

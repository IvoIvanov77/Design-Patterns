package creational.abstract_factory.furnitures.coffee_tables;

import creational.abstract_factory.CoffeeTable;

abstract class AbstractCoffeeTable implements CoffeeTable {
    private String name;

    AbstractCoffeeTable(String name) {
        this.name = name;
    }

    @Override
    public void drinkCoffee() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this.name);
    }
}

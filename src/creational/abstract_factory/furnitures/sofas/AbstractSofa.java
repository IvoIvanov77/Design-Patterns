package creational.abstract_factory.furnitures.sofas;

import creational.abstract_factory.Sofa;

abstract class AbstractSofa implements Sofa {
    private String name;

    AbstractSofa(String name) {
        this.name = name;
    }

    @Override
    public void watchTv() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this.name);
    }
}

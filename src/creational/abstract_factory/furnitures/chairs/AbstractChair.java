package creational.abstract_factory.furnitures.chairs;

import creational.abstract_factory.Chair;

abstract class AbstractChair implements Chair {
    private String name;

    AbstractChair(String name) {
        this.name = name;
    }

    @Override
    public void sitOn() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this.name);
    }
}

package creational.singleton;

public class Main {

    public static void main(String[] args) {
        NaiveSingleton.getInstance().doSomething();
        ThreadSaveSingleton.getInstance().doSomething();
        EnumSingleton.INSTANCE.doSomething();
    }

}

package creational.singleton;

public class NaiveSingleton {

    private static NaiveSingleton INSTANCE;

    private NaiveSingleton() {
    }

    public static NaiveSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NaiveSingleton();
        }
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("done");
    }

}

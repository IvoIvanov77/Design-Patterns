package creational.singleton;

public class ThreadSaveSingleton {

    private static volatile ThreadSaveSingleton INSTANCE;

    private ThreadSaveSingleton() {
    }

    public static ThreadSaveSingleton getInstance() {
        ThreadSaveSingleton result = INSTANCE;

        if (result != null) {
            return result;
        }

        synchronized(ThreadSaveSingleton.class) {
            if (INSTANCE == null) {
                INSTANCE = new ThreadSaveSingleton();
            }
            return INSTANCE;
        }
    }

    public void doSomething() {
        System.out.println("done");
    }

}

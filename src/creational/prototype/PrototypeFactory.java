package creational.prototype;

import creational.prototype.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static PrototypeFactory INSTANCE;

    private Map<String, Shape> shapeCache;

    private PrototypeFactory() {
        this.shapeCache = new HashMap<>();
    }

    public static PrototypeFactory getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new PrototypeFactory();
        }
        return INSTANCE;
    }

    public Shape put(String key, Shape shape) {
        return shapeCache.put(key, shape);
    }

    public Shape get(String key) {
        return shapeCache.get(key).clone();
    }

    public void clear() {
        shapeCache.clear();
    }
}

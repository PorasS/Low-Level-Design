package solid.interpreterPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Integer> contextMap;

    public Context() {
        contextMap = new HashMap<>();
    }

    public void put(String key, Integer value) {
        contextMap.put(key, value);
    }

    public int get(String key) {
        return contextMap.get(key);
    }
}

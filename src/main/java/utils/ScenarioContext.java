package utils;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
    private static ScenarioContext instance;
    private final Map<String, Object> scenarioData = new HashMap<>();

    private ScenarioContext() {
    }

    public static ScenarioContext getInstance() {
        if (instance == null) {
            instance = new ScenarioContext();
        }
        return instance;
    }

    public void setContext(String key, Object val) {
        scenarioData.put(key, val);
    }

    public Object getContext(String key) {
        return scenarioData.get(key);
    }
}

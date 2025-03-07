import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configurations;

    // Private constructor to prevent direct instantiation
    private ConfigurationManager() {
        configurations = new HashMap<>();
        configurations.put("maxPlayers", "100");
        configurations.put("defaultLanguage", "en");
        configurations.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }


    public String getConfig(String key) {
        return configurations.get(key);
    }


    public void printAllConfigs() {
        for (Map.Entry<String, String> entry : configurations.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
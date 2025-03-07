public class ConfigManagerDemo {
    public static void main(String[] args) {
        // Getting singleton instance
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Retrieving and printing a specific config value
        System.out.println("maxPlayers: " + configManager.getConfig("maxPlayers"));

        // Printing all configuration settings
        System.out.println("\nAll Configurations:");
        configManager.printAllConfigs();
    }
}
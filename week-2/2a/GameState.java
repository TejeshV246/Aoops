public class GameState {
    private static GameState instance;
    private String currentLevel;

    private GameState() {
        // Private constructor to prevent instantiation
    }

    public static synchronized GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public void setCurrentLevel(String level) {
        this.currentLevel = level;
    }

    public String getCurrentLevel() {
        return currentLevel;
    }
}

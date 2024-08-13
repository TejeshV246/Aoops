public class GameSimulation {
    private GameItemFactory gameItemFactory;
    private EnemyFactory enemyFactory;

    public void setup(String difficulty) {
        GameState gameState = GameState.getInstance();
        gameState.setCurrentLevel(difficulty);

        switch (difficulty) {
            case "Easy":
                gameItemFactory = new EasyGameItemFactory();
                enemyFactory = new EasyEnemyFactory();
                break;
            case "Medium":
                gameItemFactory = new MediumGameItemFactory();
                enemyFactory = new MediumEnemyFactory();
                break;
            case "Hard":
                gameItemFactory = new HardGameItemFactory();
                enemyFactory = new HardEnemyFactory();
                break;
            default:
                throw new IllegalArgumentException("Unknown difficulty level");
        }
    }

    public void start() {
        Weapon weapon = gameItemFactory.createWeapon();
        PowerUp powerUp = gameItemFactory.createPowerUp();
        Enemy enemy = enemyFactory.createEnemy();

        weapon.use();
        powerUp.activate();
        enemy.attack();
    }

    public static void main(String[] args) {
        GameSimulation simulation = new GameSimulation();
        simulation.setup("Medium"); // Set difficulty level
        simulation.start(); // Start game
    }
}

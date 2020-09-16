public class Patient {
    private static final int DEFAULT_BLOOD_LEVEL = 20;
    private static final int DEFAULT_HEALTH_LEVEL = 10;

    private int bloodLevel = DEFAULT_BLOOD_LEVEL;
    private int healthLevel = DEFAULT_HEALTH_LEVEL;


    public int getBloodLevel() {
        return bloodLevel;
    }

    public int getHealth() {
        return healthLevel;
    }

    public void removeBlood(int amount) {
        bloodLevel -= amount;
    }


    public void improveHealth(int amount) {
        healthLevel += amount;
    }
}

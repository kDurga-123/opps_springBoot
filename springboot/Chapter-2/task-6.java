// Interface Interaction: Create a method in the MountainPeak class that checks if a peak is both climbable
// and has a trek difficulty level set.
interface Trekable {
    void trekDifficulty();
    void canClimb();
}

class MountainPeak5 implements Trekable {
    String peakName;
    double altitude;
    boolean TrekDifficulty;

    public MountainPeak5(String peakName, double altitude) {
        this.peakName = peakName;
        this.altitude = altitude;
        this.TrekDifficulty = false; // Initialize to false
    }

    public void displayMountain() {
        System.out.println("Mountain Name: " + peakName);
        System.out.println("Altitude: " + altitude + " meters above sea level");
    }

    @Override
    public void canClimb() {
        System.out.println("I have reached the mountain");
    }

    @Override
    public void trekDifficulty() {
        System.out.println("Trekking difficulty level: hard");
        TrekDifficulty = true; // Set to true when trek difficulty is provided
    }

    public boolean isClimbableWithTrekDifficulty() {
        boolean canClimb = true; // Initialize to false
        boolean Difficulty = true; // Initialize to false

        // Check if climbing is possible and trek difficulty is set
        if (canClimb) {
            canClimb = true;
        }
        if (TrekDifficulty) {
            Difficulty = true;
        }

        return canClimb && Difficulty;
    }

    public static void main(String[] args) {
        MountainPeak5 obj = new MountainPeak5("Mount Everest", 8848.86);

        obj.displayMountain();
        obj.canClimb();
        obj.trekDifficulty();

        // Check if the peak is climbable with trek difficulty
        if (obj.isClimbableWithTrekDifficulty()) {
            System.out.println("This peak is both climbable and has trek difficulty .");
        } else {
            System.out.println("This peak is not both climbable and has trek difficulty .");
        }
    }
}

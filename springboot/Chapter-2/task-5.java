// Exploring Multiple Interfaces: Define another interface named Trekable with a method

// trekDifficulty(). Make the MountainPeak class implement this interface and provide an appro-
// priate implementation.

interface Trekable1 {
    void trekDifficulty();
    void canClimb();
}

class MountainPeak4 implements Trekable1 {
    String peakName;
    double altitude;

    public MountainPeak4(String peakName, double altitude) {
        this.peakName = peakName;
        this.altitude = altitude;
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
    }

    public static void main(String[] args) {
        MountainPeak4 obj = new MountainPeak4("Mount Everest", 8848.86);

        obj.displayMountain();
        obj.canClimb();
        obj.trekDifficulty();
    }
}

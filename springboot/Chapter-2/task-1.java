// Class and Object Creation: Define a class named MountainPeak with attributes peakName and
// altitude. Create an object of this class and display its attributes.

class MountainPeak2 {
    String peakName;
    double altitude;

    // Constructor
    public MountainPeak2(String peakName, double altitude) {
        this.peakName = peakName;
        this.altitude = altitude;
    }

    // Method to display mountain information
    public void displayMountain() {
        System.out.println("Mountain Name: " + peakName);
        System.out.println("Altitude: " + altitude + " meters above sea level");
    }

    public static void main(String[] args) {
        // Create an object of MountainPeak
        MountainPeak2 obj = new MountainPeak2("Mount Everest", 8848.86);

        // Call the displayMountain method to display information
        obj.displayMountain();
    }
}

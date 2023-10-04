// Replicating with Copy Constructors: Add a copy constructor to the MountainPeak class. Create an object
// that’s a copy of an existing MountainPeak object.

class MountainPeak3 {
    String peakName;
    double altitude;

    // Parameterized Constructor
    public MountainPeak3(String peakName, double altitude) {
        this.peakName = peakName;
        this.altitude = altitude;
    }

    // Copy Constructor
    public MountainPeak3(MountainPeak3 original) {
        this.peakName = original.peakName;
        this.altitude = original.altitude;
    }

    // Method to display mountain information
    public void displayMountain() {
        System.out.println("Mountain Name: " + peakName);
        System.out.println("Altitude: " + altitude + " meters above sea level");
    }

    public static void main(String[] args) {
        // Create an object of MountainPeak
        MountainPeak3 obj = new MountainPeak3("Mount Everest", 8848.86);

        // Create another object by using the copy constructor
        MountainPeak3 obj1 = new MountainPeak3(obj);

        // Call the displayMountain method to display information
        obj.displayMountain();
        obj1.displayMountain();
    }
}

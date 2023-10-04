// Customizing with Constructors: Extend the MountainPeak class to include a parameterized constructor.
// Instantiate the class using this constructor and display the attributes.

class MountainPeak1 {
    String name;     // Name of the mountain
    double height;   // height of the mountain in meters above sea level

    // Parameterized Constructor
    public MountainPeak1(String name, double height) {
        this.name = name;
        this.height = height;
    }

    // Method to display mountain information
    public void displayMountainInfo() {
        System.out.println("Mountain Name: " + name);
        System.out.println("Altitude: " + height + " meters above sea level");
    }

    public static void main(String[] args) {
        // Instantiate the class using the parameterized constructor
        MountainPeak1 mountain = new MountainPeak1("Trisul", 8848);

        // Call the displayMountainInfo method to display information
        mountain.displayMountainInfo();
    }
}

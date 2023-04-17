/*
Ken Sheridan
GuitarApp.java
17/04/23
*/

// Application to demonstrate inheritance
public class GuitarApp {
    // Vars
    private ElectricGuitar guitar;
    // objects
    public GuitarApp() {
        guitar = new ElectricGuitar("Fender", "Stratocaster", 3);
    }
     // Methods
    public void run() {
        guitar.tune();
        guitar.play();
    }
    // Implementation of the subclass which inherits from the superclass
    public static void main(String[] args) {
        GuitarApp app = new GuitarApp();
        app.run();
    }
}

/*
Ken Sheridan
Guitar.java
17/04/23
*/

public class Guitar {
    // Vars
    protected String brand;
    private String model;
    // Constructor
    public Guitar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    // Method / Output
    public void tune() {
        System.out.println("\nTuning the " + brand + " " + model + " guitar...");
    }
}
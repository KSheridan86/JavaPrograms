/*
Ken Sheridan
ElectricGuitar.java
17/04/23
*/

public class ElectricGuitar extends Guitar {
    // Vars
    private int numPickups;
    private String model;
    private String brand;
    // Constructor / Subclass of Guitar
    public ElectricGuitar(String brand, String model, int numPickups) {
        super(brand, model);
        this.numPickups = numPickups;
        this.brand = brand;
        this.model = model;
    }
    // Method / Output
    public void play() {
        System.out.println("\nPlaying the " + brand + " " + model + " guitar through the " + numPickups + "rd pickup...\n");
    }
}
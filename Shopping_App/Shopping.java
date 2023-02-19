public class Shopping {
    //Vars
    final private double MILKCOST;
    final private double BREADCOST;
    final private double BISCUITCOST;
    private int milkAmount;
    private int breadAmount;
    private int biscuitAmount;
    private double totalCost;
    //Constructor
    public Shopping() {
        milkAmount = 0;
        breadAmount = 0;
        biscuitAmount = 0;
        totalCost = 0.00;
        MILKCOST = 2.56;
        BREADCOST = 1.45;
        BISCUITCOST = 2.64;
    }
    //Set
    public void setMilkAmount(int milkAmount) {
        this.milkAmount = milkAmount;
    }
    public void setBreadAmount(int breadAmount) {
        this.breadAmount = breadAmount;
    }
    public void setBiscuitAmount(int biscuitAmount) {
        this.biscuitAmount = biscuitAmount;
    }
    //Compute
    public void setTotalCost() {
        totalCost = (MILKCOST * milkAmount) + (BREADCOST * breadAmount) + (BISCUITCOST * biscuitAmount);
    }
    //Get
    public double totalPrice() {
        return totalCost;
    }
}
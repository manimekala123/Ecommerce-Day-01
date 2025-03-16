class Fruits extends Product {
    private boolean organic;

    public Fruits(String name, double price, int quantity, boolean organic) {
        super(name, price, quantity, "Fruit");
        this.organic = organic;
    }

    public boolean isOrganic() {
        return organic;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Organic: " + (organic ? "Yes" : "No"));
        System.out.println("---------------------------");
    }
}

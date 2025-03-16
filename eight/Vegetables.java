class Vegetables extends Product {
    private boolean seasonal;

    public Vegetables(String name, double price, int quantity, boolean seasonal) {
        super(name, price, quantity, "Vegetable");
        this.seasonal = seasonal;
    }

    public boolean isSeasonal() {
        return seasonal;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seasonal: " + (seasonal ? "Yes" : "No"));
        System.out.println("---------------------------");
    }
}

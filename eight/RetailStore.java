class RetailStore {
    private Product[] products;
    private int productCount;
    private static final int MAX_PRODUCTS = 100;

    public RetailStore() {
        products = new Product[MAX_PRODUCTS];
        productCount = 0;
    }

    // Add a product to the store
    public void addProduct(Product product) {
        if (productCount < MAX_PRODUCTS) {
            products[productCount] = product;
            productCount++;
            System.out.println("Product added successfully!");
        } else {
            System.out.println("Store is full! Cannot add more products.");
        }
    }

    // Edit a product by ID
    public void editProduct(String name, double price, int quantity) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getName().equals(name)) {
                products[i].setPrice(price);
                products[i].setQuantity(quantity);
                System.out.println("Product updated successfully!");
                return;
            }
        }
        System.out.println(name + " not found!");
    }

    // Delete a product by ID
    public void deleteProduct(String name) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getName().equals(name)) {
                // Move all products one position back
                for (int j = i; j < productCount - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[productCount - 1] = null;
                productCount--;
                System.out.println("Product deleted successfully!");
                return;
            }
        }
        System.out.println(name+ " not found!");
    }

    // Display all products
    public void displayAllProducts() {
        if (productCount == 0) {
            System.out.println("No products available in the store!");
            return;
        }
        
        System.out.println("\n===== AVAILABLE PRODUCTS =====\n");
        for (int i = 0; i < productCount; i++) {
            products[i].displayDetails();
        }
    }

    // Display products by category
    public void displayProductsByCategory(String category) {
        boolean found = false;
        System.out.println("\n===== " + category.toUpperCase() + " PRODUCTS =====\n");
        
        for (int i = 0; i < productCount; i++) {
            if (products[i].getCategory().equalsIgnoreCase(category)) {
                products[i].displayDetails();
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No " + category + " products available!");
        }
    }

    // Search product by name
    public void searchProductByName(String name) {
        boolean found = false;
        System.out.println("\n===== SEARCH RESULTS =====\n");
        
        for (int i = 0; i < productCount; i++) {
            if (products[i].getName().toLowerCase().contains(name.toLowerCase())) {
                products[i].displayDetails();
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No products found with name containing '" + name + "'");
        }
    }
}

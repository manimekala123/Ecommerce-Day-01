public class Main {
    public static void main(String[] args) {
        
        RetailStore store = new RetailStore();
        
        // Add products to the store
        store.addProduct(new Fruits("Apple", 1.99, 100, true));
        store.addProduct(new Fruits("Banana", 0.99, 150, false));
        store.addProduct(new Vegetables("Carrot", 1.49, 80, true));
        store.addProduct(new Vegetables("Spinach", 2.49, 50, true));
        
        // Display all products
        store.displayAllProducts();
        
        System.out.println("\n===== AFTER EDITING =====\n");
        
        // Edit a product
        store.editProduct("Green Apple", 2.49, 75);
        
        // Delete a product
        store.deleteProduct("G002");
        
        // Display all products after modifications
        store.displayAllProducts();
        
        // Display products by category
        store.displayProductsByCategory("Fruit");
        
        // Search product by name
        store.searchProductByName("apple");
    }
}

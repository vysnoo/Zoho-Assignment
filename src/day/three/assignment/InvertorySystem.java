package day.three.assignment;

public class InvertorySystem {
    public static void main(String[] args) {
        Store.setStoreDetails("TechMart","Chennai");

        Product p1 = new Product(101, "Laptop", 75000, 10);
        Product p2 = new Product(102, "Mouse", 600, 25);
        Product p3 = new Product(103, "Keyboard", 500, 20);

        Store store= new Store();
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        Store.displayStoreDetails();
        store.displayProducts();
    }
}

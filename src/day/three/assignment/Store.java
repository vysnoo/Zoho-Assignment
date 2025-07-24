package day.three.assignment;

import java.util.ArrayList;
import java.util.List;

public class Store {
    static String storeName;
    static String storeLocation;

    static void setStoreDetails(String name,String location){
        storeName=name;
        storeLocation=location;
    }
    static void displayStoreDetails(){
        System.out.println("Store Name - "+storeName);
        System.out.println("Store Location - "+storeLocation);
    }

    List<Product> products = new ArrayList<>();

    void addProduct(Product product){
        products.add(product);
    }

    void displayProducts(){
        for(Product product : products){
            product.displayProduct();
        }
    }
}

package day.three.assignment;


public class Product {
    int productId;
    String name;
    double price;
    int quantity;

    Product(int productId,String name,double price,int quantity){
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    void displayProduct(){
        System.out.println("Product Id - "+productId);
        System.out.println("Product Name - "+name);
        System.out.println("Product price - "+price);
        System.out.println("Quantity - "+quantity);
    }
}

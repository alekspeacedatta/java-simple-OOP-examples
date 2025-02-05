import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        Product product1 = new Product("Bread", 40);
        Product product2 = new Product("Water", 50);
        Product product3 = new Product("butter", 55);


        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        inventory.chekLowInventory();
    }
}
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;
    Inventory(){
        products = new ArrayList<Product>();
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public void chekLowInventory(){
        for (Product product : products) {
            if (product.getQuantity() <= 100)
            System.out.println(product.getName()+ " is running low in inventory. Current quantity is " + product.getQuantity());
        }
    }
    public  ArrayList getProducts(){
        return products;
    }

}

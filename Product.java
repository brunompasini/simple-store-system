package produto;

public class Product {
    String name;
    double price;
    int quantity;
    
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public String toString() {
        return (this.name + " : $" + this.price+", in stock: "+this.quantity);
    }
    
    /*
    public static void main(String[] args) {
        Product me = new Product("chips1", 10.55,10);
        System.out.println(me);
    }
    */
}


package Day03;

public class Product {
    double price;
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double setPrice(int quantity){
        return quantity * this.price;
    }
}

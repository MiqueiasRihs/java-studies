package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProduct(int qnt) {
        this.quantity += qnt;
    }

    public void removeProduct(int qnt) {
        this.quantity -= qnt;
    }
}

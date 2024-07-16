package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalDoValorNoEstoque() {
        return price * quantity;
    }

    public void addProductsNoestoque(int quantity) {
        this.quantity += quantity;
    }

    public void removeProductsDoEstoque(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", R$ " + String.format("%.2f", price) + ", Quantidade: " + quantity + ", Total R$ " + String.format("%.2f", totalDoValorNoEstoque());
    }
}

package sortAlgorithm;

public class Product {
    private int price;

    private int sale;

    public Product(int price, int sale) {
        this.price = price;
        this.sale = sale;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", sale=" + sale +
                '}';
    }
}

package rajam.sushi.modal;

public class Product {
    private int id;
    private String prodName;
    private int prodPrice;

    public Product(String prodName, int id, int prodPrice) {
        this.prodName = prodName;
        this.id = id;
        this.prodPrice = prodPrice;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

}

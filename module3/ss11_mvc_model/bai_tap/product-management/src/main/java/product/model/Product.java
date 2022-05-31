package product.model;

public class Product {
    private int id;
    private String nameProduct;
    private Integer price;
    private String productDescription;
    private String factory;

    public Product() {
    }

    public Product(int id, String nameProduct, Integer price, String productDescription, String factory) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.productDescription = productDescription;
        this.factory = factory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}

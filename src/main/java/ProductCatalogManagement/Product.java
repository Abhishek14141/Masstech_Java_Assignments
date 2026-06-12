package ProductCatalogManagement;


import java.util.Objects;

public class Product {

    private int productId;
    private String productName;
    private double price;
    private String category;

    public Product(int productId, String productName, double price, String category){

        this.productId=productId;
        this.productName=productName;
        this.price=price;
        this.category=category;
    }

    @Override
    public String toString(){
        return "Product [ID=" +productId+", Name=" +productName+", Price=" +price+ ", Category=" +category+ "]";
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;

        if(obj==null || getClass() != obj.getClass())
            return false;

        Product product = (Product) obj;
        return this.productId == product.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }



}

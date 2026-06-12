package ProductCatalogManagement;

public class ProductTest {

    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 55000, "Electronics");
        Product p2 = new Product(102, "TV", 75000, "Electronics");
        Product p3 = new Product(103, "Shoes", 2500, "Fashion");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("p1 equals p2: " +p1.equals(p2));
        System.out.println("p2 equals p3: " +p2.equals(p3));

    }
}


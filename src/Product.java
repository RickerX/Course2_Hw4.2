
import java.util.ArrayList;
import java.util.List;

public class Product {
    private String product;
    private List productList;

    public Product(String product) {
        checkProduct(product);
        productList = new ArrayList<>();
    }

    public List getProductList() {
        return productList;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        if (product != null && !product.isEmpty() && !product.isBlank()) {
            this.product = product;
        } else {
            throw new RuntimeException("Продукт не указан");
        }
    }

    private void checkProduct(String product) {
        if (product != null && !product.isEmpty() && !product.isBlank()) {
            this.product = product;
        } else {
            throw   new RuntimeException("Продукт не указан");
        }
    }

    @Override
    public String toString() {
        return product;
    }
}

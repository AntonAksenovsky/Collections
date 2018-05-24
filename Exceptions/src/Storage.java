import java.util.HashMap;
import java.util.Map;

public class Storage {
    private final Map<ProductType, Integer> products = new HashMap<>();

    public void Storage() {
        products.put(ProductType.JUICE, 100);
        products.put(ProductType.MILK, 100);
        products.put(ProductType.LEMONADE, 100);
        products.put(ProductType.TEA, 100);
    }

    public Map<ProductType, Integer> getProducts() {
        return new HashMap<>(products);
    }

    public void changeProductCount(ProductType productType, Integer count) {
        products.put(productType, count);
    }


}

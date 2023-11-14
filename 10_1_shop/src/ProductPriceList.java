import java.util.ArrayList;

public class ProductPriceList {

    private ArrayList<Product> priceList;


    public ProductPriceList() {
        priceList = new ArrayList<>();
    }

    public void add(Product product) {
        priceList.add(product);
    }

    public void removeByIndex(int index) {
        priceList.remove(index);
    }



}

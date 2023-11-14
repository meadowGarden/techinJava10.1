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

    @Override
    public String toString() {

        String annotation = String.format("price list for current inventory%n");

        String fullList = "";
        for (Product item : priceList) {
            fullList = fullList.concat(item.getProductName());
            fullList = fullList.concat(", base price -> ");
            fullList = fullList.concat(String.valueOf(item.getProductPriceNettoEur()));
            fullList = fullList.concat(", price with vat -> ");
            fullList = fullList.concat(String.valueOf(item.priceWithTaxes()));
            fullList = fullList.concat("\n");
        }

        return "--- - ---\n" + annotation + fullList;
    }



}

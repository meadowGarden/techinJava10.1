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
            fullList = fullList.concat(String.format("%-20s",item.getProductName()));
//            fullList = fullList.concat(", base price (eur): ");
//            fullList = fullList.concat(String.format("%.2f",item.getProductPriceNettoEur()));
            fullList = fullList.concat(" price (eur): ");
            fullList = fullList.concat(String.format("%.2f,",item.priceWithTaxes()));
            fullList = fullList.concat(" price (chf): ");
            fullList = fullList.concat(String.format("%.2f",item.priceWithTaxesConvertedFranc()));
            fullList = fullList.concat("\n");
        }

        return "--------------------------------\n" +
                annotation +
                "--------------------------------\n" +
                fullList;
    }



}

public class ProductWine extends Product {

    private double alcoholVolume;


    public ProductWine(String productName, double productPriceNettoEur, double volume, double alcoholVolume) {
        super(productName, productPriceNettoEur, volume);
        this.alcoholVolume = alcoholVolume;
    }

    @Override
    public double priceWithVatEur(int rate) {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("wine: %s, ", super.getProductName());
    }

}

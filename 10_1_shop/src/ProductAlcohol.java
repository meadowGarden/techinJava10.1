public class ProductAlcohol extends Product {

    private double alcoholVolume;

    public ProductAlcohol(String productName, double productPriceNettoEur, double volume, double alcoholVolume) {
        super(productName, productPriceNettoEur, volume);
        this.alcoholVolume = alcoholVolume;
    }

    @Override
    public double priceWithVatEur(int rate) {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("alcohol: %s, ", super.getProductName());
    }

}

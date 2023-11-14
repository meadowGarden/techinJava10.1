public class ProductGeneral extends Product {

    public ProductGeneral(String productName, double productPriceNettoEur) {
        super(productName, productPriceNettoEur);
    }

    public ProductGeneral(String productName, double productPriceNettoEur, double volume) {
        super(productName, productPriceNettoEur, volume);
    }


    @Override
    public double priceWithVatEur(int rate) {
        ValueAddedTax vat = new ValueAddedTax();
        double priceBruttoEur = super.getProductPriceNettoEur() * ((double) (100 + rate) / 100);
        return (double)Math.round(priceBruttoEur * 100) / 100;
    }


    @Override
    public String toString() {
        return String.format("general product: %s, ", super.getProductName());
    }


}

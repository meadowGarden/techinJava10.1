public class ProductGeneral extends Product {

    public ProductGeneral(String productName, double productPriceNettoEur) {
        super(productName, productPriceNettoEur);
    }

    public ProductGeneral(String productName, double productPriceNettoEur, double volume) {
        super(productName, productPriceNettoEur, volume);
    }

    @Override
    public double priceWithTaxes() {
        Taxes vat = new Taxes();
        return super.getProductPriceNettoEur() + vat.vatTaxation(this, super.getProductPriceNettoEur());
    }

    @Override
    public String toString() {
        return String.format("general product: %s, ", super.getProductName());
    }


}

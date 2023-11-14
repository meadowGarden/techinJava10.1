public class ProductDrugs extends Product {

    public ProductDrugs(String productName, double productPriceNettoEur) {
        super(productName, productPriceNettoEur);
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

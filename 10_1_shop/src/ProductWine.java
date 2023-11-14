public class ProductWine extends Product {

    private double alcoholVolume;


    public ProductWine(String productName, double productPriceNettoEur, double volume, double alcoholVolume) {
        super(productName, productPriceNettoEur, volume);
        this.alcoholVolume = alcoholVolume;
    }

    @Override
    public double priceWithTaxes() {

        Taxes taxes = new Taxes();

        return super.getProductPriceNettoEur() + taxes.vatTaxation(this, super.getProductPriceNettoEur())
                + taxes.exciseTax(this, super.getProductPriceNettoEur(), super.getVolume(), this.alcoholVolume);
    }

    @Override
    public String toString() {
        return String.format("wine: %s, ", super.getProductName());
    }

}

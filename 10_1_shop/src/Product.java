public abstract class Product {

    private String productName;
    private double productPriceNettoEur;
    private double volume;


    public Product() {
        this("empty slot", 0.0, 0.0);
    }

    public Product(String productName, double productPriceNettoEur) {
        this(productName, productPriceNettoEur, 0.0);
    }

    public Product(String productName, double productPriceNettoEur, double volume) {
        this.productName = productName;
        this.productPriceNettoEur = productPriceNettoEur;
        this.volume = volume;
    }


    public String getProductName() {
        return productName;
    }

    public double getProductPriceNettoEur() {
        return productPriceNettoEur;
    }

    public double getVolume() {
        return volume;
    }

    abstract double priceWithTaxes();
    public double priceWithTaxesConvertedFranc() {
        return (double)Math.round(priceWithTaxes() * 0.97 * 100) / 100;
    }



    @Override
    public String toString() {
        return String.format("product: %s, base price (eur): %.2f", productName, productPriceNettoEur);
    }

}

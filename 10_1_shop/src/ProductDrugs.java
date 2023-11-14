public class ProductDrugs extends Product {

    public ProductDrugs(String productName, double productPriceNettoEur) {
        super(productName, productPriceNettoEur);
    }

    @Override
    public double priceWithVatEur(int rate) {
       return 0.0;
    }

}

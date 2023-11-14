public class Taxes {

    public double vatTaxation(Product product, double basePrice) {
        if (product instanceof ProductDrugs) {
            return basePrice * 0.09;
        } else {
            return basePrice * 0.21;
        }
    }

    public double exciseTax(Product product, double basePrice, double volume, double alcoholVolume) {
        double tax;
        if ((product instanceof ProductGeneral) || (product instanceof ProductDrugs)) {
            return 0.0;
        } else if ((product instanceof ProductWine) && (alcoholVolume <= 8.5)) {
            tax = (volume * basePrice) * 0.28;
            return (double)Math.round(tax * 100) / 100;
        } else if ((product instanceof ProductWine) && (alcoholVolume > 8.5)) {
            tax = (volume * basePrice) * 0.72;
            return (double)Math.round(tax * 100) / 100;
        } else if ((product instanceof ProductAlcohol) && (alcoholVolume <= 15)) {
            tax = (volume * basePrice) * 0.89;
            return (double)Math.round(tax * 100) / 100;
        } else if ((product instanceof ProductAlcohol) && (alcoholVolume > 15)) {
            tax = (volume * basePrice) * 1.26;
            return (double)Math.round(tax * 100) / 100;
        }
        return 0.0;
    }
}

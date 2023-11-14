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
            return (volume * basePrice) * 0.28;
        } else if ((product instanceof ProductWine) && (alcoholVolume > 8.5)) {
            return (volume * basePrice) * 0.72;
        } else if ((product instanceof ProductAlcohol) && (alcoholVolume <= 15)) {
            return (volume * basePrice) * 0.89;
        } else if ((product instanceof ProductAlcohol) && (alcoholVolume > 15)) {
            return (volume * basePrice) * 1.26;
        }
        return 0.0;
    }
}

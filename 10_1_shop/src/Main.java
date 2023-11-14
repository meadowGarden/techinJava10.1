import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        ProductGeneral bottleOfWater01 = new ProductGeneral("water bottle", 0.3, 1.0);
//        System.out.println(bottleOfWater01);
//        System.out.println(bottleOfWater01.priceWithVatEur(21));
//
//        ProductDrugs painkillers01 = new ProductDrugs("ibuprofen pack", 3.50);
//        System.out.println(painkillers01);
//
//        ProductWine bottleOfWine01 = new ProductWine("wine bottle (weak)", 6.50, 1.0);
//        System.out.println(bottleOfWine01);
//
//        ProductWine bottleOfWine02 = new ProductWine("wine bottle (strong)", 8.00, 1.0);
//        System.out.println(bottleOfWine02);
//
//        ProductAlcohol bottleOfAlcohol1 = new ProductAlcohol("alcohol bottle (weak)", 10.00, 1.0);
//        System.out.println(bottleOfAlcohol1);
//
//        ProductAlcohol bottleOfAlcohol02 = new ProductAlcohol("alcohol bottle (strong)", 15.00, 1.0);
//        System.out.println(bottleOfAlcohol02);

        Scanner scanner = new Scanner(System.in);
        ProductPriceList  shopPriceList = new ProductPriceList();

        String menuInput;


        while (true) {
            System.out.println("choose what you want to do:\n  - enter new products (a) / manage price list (b) / exit (x)");
            menuInput = scanner.nextLine();

            if (menuInput.equals("a")) {
                operationsWithProducts(scanner, shopPriceList);
            } else if (menuInput.equals("b")) {
                System.out.println(shopPriceList);;
            } else {
                break;
            }
        }
    }


    public static void operationsWithProducts(Scanner scanner, ProductPriceList  shopPriceList) {

        String productName;
        double basePrice;
        double volume;
        double alcoholVolume;

        while (true) {

            System.out.println("enter wanted product type:\n  - general product (p1) / drugs (p2) - wine (p3) - alcohol (p4)");
            String enteredValue = scanner.nextLine();
            if (enteredValue.isEmpty()) {
                break;
            }

            switch (enteredValue) {
                case "p1":
                    System.out.print("enter product name -> ");
                    productName = scanner.nextLine();
                    System.out.print("enter base price (eur) -> ");
                    basePrice = Double.parseDouble(scanner.nextLine());
                    shopPriceList.add(new ProductGeneral(productName, basePrice));
                    break;

                case "p2":
                    System.out.print("enter product name -> ");
                    productName = scanner.nextLine();
                    System.out.print("enter base price (eur) -> ");
                    basePrice = Double.parseDouble(scanner.nextLine());
                    shopPriceList.add(new ProductDrugs(productName, basePrice));
                    break;

                case "p3":
                    System.out.print("enter product name -> ");
                    productName = scanner.nextLine();
                    System.out.print("enter base price (eur) -> ");
                    basePrice = Double.parseDouble(scanner.nextLine());
                    System.out.print("enter bottle volume (l) -> ");
                    volume = Double.parseDouble(scanner.nextLine());
                    System.out.print("enter alcohol volume (%) -> ");
                    alcoholVolume = Double.parseDouble(scanner.nextLine());
                    shopPriceList.add(new ProductWine(productName, basePrice, volume, alcoholVolume));
                    break;
                case "p4":
                    System.out.print("enter product name -> ");
                    productName = scanner.nextLine();
                    System.out.print("enter base price (eur) -> ");
                    basePrice = Double.parseDouble(scanner.nextLine());
                    System.out.print("enter bottle volume (l) -> ");
                    volume = Double.parseDouble(scanner.nextLine());
                    System.out.print("enter alcohol volume (%) -> ");
                    alcoholVolume = Double.parseDouble(scanner.nextLine());
                    shopPriceList.add(new ProductAlcohol(productName, basePrice, volume, alcoholVolume));
                    break;
            }

        }
    }











}

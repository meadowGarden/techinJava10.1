import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductPriceList  shopPriceList = new ProductPriceList();

        mainManu(scanner, shopPriceList);
    }

    public static void mainManu(Scanner scanner, ProductPriceList  shopPriceList) {
        String menuInput;

        while (true) {

            System.out.println("choose what you want to do:\n  - enter new products (a) / manage price list (b) / exit (x)");
            menuInput = scanner.nextLine();
            if (menuInput.equals("x")) {
                break;
            }

            switch (menuInput) {
                case "a" :
                    operationsWithProducts(scanner, shopPriceList);
                    break;
                case "b" :
                    operationsWithInventory(scanner, shopPriceList);
                    break;
                default:
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

            System.out.println("\n - enter wanted product type:\n  -- general product (p1) / drugs (p2) - wine (p3) - alcohol (p4)");
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
                default:
                    break;
            }
        }
    }

    public static void operationsWithInventory(Scanner scanner, ProductPriceList  shopPriceList) {

        while (true) {

            System.out.println("\n - choose your action with inventory:\n  -- print inventory (a) / delete product (b) / go back (x)");
            String menuInput = scanner.nextLine();
            if (menuInput.equals("x")) {
                break;
            }

            switch (menuInput) {
                case "a":
                    System.out.println(shopPriceList);
                    break;
                case "b":
                    System.out.println("choose which item to delete:");
                    int itemToDelete = Integer.parseInt(scanner.nextLine());
                    shopPriceList.removeByIndex(itemToDelete - 1);
                    break;
                default:
                    break;
            }
        }
    }

}

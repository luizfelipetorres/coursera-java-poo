package Lab9.ex2.store;

public class Inventory {
    public static void produceReport(Item[] itens) {
        double totalPrice = 0;
        int totalQuantity = 0;

        System.out.printf("%-30s - %10s - %5s\n", "Title", "Price", "Quantity");
        for (Item i : itens) {
            if (i == null)
                break;
            System.out.printf("%-30s - %10.2f - %5d\n", i.getTitle(), i.getPrice(), i.getQuantity());
            totalQuantity += i.getQuantity();
            totalPrice += i.getPrice();
        }
        System.out.printf("%-30s - %10.2f - %5d\n", "Total", totalPrice, totalQuantity);
    }
}

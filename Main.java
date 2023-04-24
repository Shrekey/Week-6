import java.util.Scanner;

class Publication {
    String title;
    double price;
    int copies;

    Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }
}

class Book extends Publication {
    String author;

    Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }
}

class Magazine extends Publication {
    int orderQty;
    String currentIssue;

    Magazine(String title, double price, int copies, int orderQty, String currentIssue) {
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currentIssue = currentIssue;
    }

    double calculateSale() {
        return price * copies;
    }

    int calculateTotalOrdered() {
        return copies + orderQty;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title of the magazine: ");
        String title = scanner.nextLine();

        System.out.print("Enter the price of the magazine: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the number of copies sold: ");
        int copies = scanner.nextInt();

        System.out.print("Enter the number of copies ordered: ");
        int orderQty = scanner.nextInt();

        System.out.print("Enter the current issue of the magazine: ");
        scanner.nextLine();
        String currentIssue = scanner.nextLine();

        Magazine magazine = new Magazine(title, price, copies, orderQty, currentIssue);
        double sale = magazine.calculateSale();
        int totalOrdered = magazine.calculateTotalOrdered();

        System.out.println("Total number of copies ordered: " + totalOrdered);
        System.out.println("Total sale of the publication: $" + sale);

        scanner.close();
    }
}

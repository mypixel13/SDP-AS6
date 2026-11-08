public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addItem(new Book("Clean Code", "Robert Martin", 464));
        library.addItem(new Book("Head First Design Patterns", "Freeman & Robson", 694));
        library.addItem(new Magazine("National Geographic", 12, 120));
        library.addItem(new Dvd("Interstellar", 169));

        System.out.println("=== Catalog ===");
        library.accept(new CatalogPrinterVisitor());

        LateFeeVisitor feeVisitor = new LateFeeVisitor(3);
        library.accept(feeVisitor);
        System.out.println("\nLate fee for 3 days: " + feeVisitor.getTotalFee() + " KZT");

        ShippingWeightVisitor weightVisitor = new ShippingWeightVisitor();
        library.accept(weightVisitor);
        System.out.println("Parcel weight: " + weightVisitor.getTotalWeight() + " g");
    }
}


public class ShippingWeightVisitor implements LibraryVisitor {
    private static final double GRAMS_PER_BOOK_PAGE = 1.5;
    private static final double GRAMS_PER_MAGAZINE_PAGE = 0.8;
    private static final double DVD_WEIGHT = 20.0;

    private double totalWeight = 0;

    @Override
    public void visitBook(Book book) {
        totalWeight += book.getPages() * GRAMS_PER_BOOK_PAGE;
    }

    @Override
    public void visitMagazine(Magazine magazine) {
        totalWeight += magazine.getPages() * GRAMS_PER_MAGAZINE_PAGE;
    }

    @Override
    public void visitDvd(Dvd dvd) {
        totalWeight += DVD_WEIGHT;
    }

    public double getTotalWeight() { return totalWeight; }
}

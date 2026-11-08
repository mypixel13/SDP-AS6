
public class LateFeeVisitor implements LibraryVisitor {
    private static final double BOOK_FEE_PER_DAY = 50.0;
    private static final double MAGAZINE_FEE_PER_DAY = 30.0;
    private static final double DVD_FEE_PER_DAY = 100.0;

    private final int daysLate;
    private double totalFee = 0;

    public LateFeeVisitor(int daysLate) {
        this.daysLate = daysLate;
    }

    @Override
    public void visitBook(Book book) {
        totalFee += BOOK_FEE_PER_DAY * daysLate;
    }

    @Override
    public void visitMagazine(Magazine magazine) {
        totalFee += MAGAZINE_FEE_PER_DAY * daysLate;
    }

    @Override
    public void visitDvd(Dvd dvd) {
        totalFee += DVD_FEE_PER_DAY * daysLate;
    }

    public double getTotalFee() { return totalFee; }
}


public class CatalogPrinterVisitor implements LibraryVisitor {

    @Override
    public void visitBook(Book book) {
        System.out.println("[Book] " + book.getTitle() + " by " + book.getAuthor()
                + ", " + book.getPages() + " pages");
    }

    @Override
    public void visitMagazine(Magazine magazine) {
        System.out.println("[Magazine] " + magazine.getTitle() + " #" + magazine.getIssueNumber()
                + ", " + magazine.getPages() + " pages");
    }

    @Override
    public void visitDvd(Dvd dvd) {
        System.out.println("[DVD] " + dvd.getTitle() + ", " + dvd.getDurationMinutes() + " min");
    }
}

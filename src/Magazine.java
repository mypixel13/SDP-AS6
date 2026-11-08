public class Magazine implements LibraryItem {
    private final String title;
    private final int issueNumber;
    private final int pages;

    public Magazine(String title, int issueNumber, int pages) {
        this.title = title;
        this.issueNumber = issueNumber;
        this.pages = pages;
    }

    public String getTitle() { return title; }
    public int getIssueNumber() { return issueNumber; }
    public int getPages() { return pages; }

    @Override
    public void accept(LibraryVisitor visitor) {
        visitor.visitMagazine(this); // double dispatch
    }
}

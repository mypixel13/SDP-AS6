public class Dvd implements LibraryItem {
    private final String title;
    private final int durationMinutes;

    public Dvd(String title, int durationMinutes) {
        this.title = title;
        this.durationMinutes = durationMinutes;
    }

    public String getTitle() { return title; }
    public int getDurationMinutes() { return durationMinutes; }

    @Override
    public void accept(LibraryVisitor visitor) {
        visitor.visitDvd(this); // double dispatch
    }
}

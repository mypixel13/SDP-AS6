import java.util.ArrayList;
import java.util.List;


public class Library {
    private final List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void accept(LibraryVisitor visitor) {
        for (LibraryItem item : items) {
            item.accept(visitor);
        }
    }
}

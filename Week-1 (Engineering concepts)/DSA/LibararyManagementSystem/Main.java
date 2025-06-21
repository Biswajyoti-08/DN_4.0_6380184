import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public void LinearSearch(ArrayList<Book> obj, String author, String title) {
        boolean found = false;
        for (int i = 0; i < obj.size(); i++) {
            if (obj.get(i).getTitle().equalsIgnoreCase(title) || obj.get(i).getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Found at :" + obj.get(i).hashCode());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Auth or title unavailable");
        }
    }

    public int BinarySearchByTitle(ArrayList<Book> obj, String title) {
        int low = 0;
        int high = obj.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = obj.get(mid).getTitle().compareToIgnoreCase(title);
            if (cmp == 0) return mid;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public int BinarySearchByAuthor(ArrayList<Book> obj, String author) {
        int low = 0;
        int high = obj.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = obj.get(mid).getAuthor().compareToIgnoreCase(author);
            if (cmp == 0) return mid;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Book> obj = new ArrayList<>();
        obj.add(new Book(101, "harry potter and the prisoner of azkaban", "JK ROWLING"));
        obj.add(new Book(102, "harry potter and the goblet of fire", "JK ROWLING"));
        obj.add(new Book(103, "a song of ice and fire", "GEORGE R R MARTIN"));
        obj.add(new Book(104, "pride and prejudice", "JANE AUSTEN"));

        Collections.sort(obj, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
        Main m = new Main();

        m.LinearSearch(obj, "JK ROWLING", "pride and prejudice");

        int indexTitle = m.BinarySearchByTitle(obj, "a song of ice and fire");
        if (indexTitle != -1) {
            System.out.println("Found title at index " + indexTitle + ": " + obj.get(indexTitle).getTitle());
        } else {
            System.out.println("Title not found");
        }

        Collections.sort(obj, Comparator.comparing(Book::getAuthor, String.CASE_INSENSITIVE_ORDER));
        int indexAuthor = m.BinarySearchByAuthor(obj, "JANE AUSTEN");
        if (indexAuthor != -1) {
            System.out.println("Found author at index " + indexAuthor + ": " + obj.get(indexAuthor).getAuthor());
        } else {
            System.out.println("Author not found");
        }
    }
}

package ua.com.alevel.fixedProjects.thirdTask;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public static void main(String[] args) {
        List<Album> albumSource = new ArrayList<>();
        List<Album> albumDestination = new ArrayList<>();
        List<Book> booksDestination = new ArrayList<>();

        /* Some code to test that program's working */

        Album album = new Album();
        albumSource.add(album);
        copyToBooks(albumSource, booksDestination);
        copyToBooks(albumSource, albumDestination);
        System.out.println("Size:" + albumDestination.size());
        System.out.println("Size:" + booksDestination.size());

    }

    public static <T> void copyToBooks(List< ? extends T > src, List<T> dest) {
        for (T book : src) {
            dest.add(book);
        }

    }


}
class Book{
}

class Album extends Book{

}

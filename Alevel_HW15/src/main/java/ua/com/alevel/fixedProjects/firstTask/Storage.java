package ua.com.alevel.fixedProjects.firstTask;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private List<T> books = new ArrayList<>();


    public void addAll(List<? extends T> list) {
        books.addAll(list);
    }


    public static void main(String[] args) {
        Storage<Book> storage = new Storage<>();
        List<Album> albums = new ArrayList<>();

        /* Some code to test that program's working */
        Album album = new Album();
        albums.add(album);
        storage.addAll(albums);
        System.out.println("Size:" + storage.books.size());
    }
}
class Book{

}

class Album extends Book{

}

package ua.com.alevel.fixedProjects.secondTask;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    public static void main(String[] args) {
        List<Album> booksSource = new ArrayList<>();
        List<Book> booksDestination = new ArrayList<>();
        Album album = new Album();
        booksSource.add(album);
        copyToBooks(booksSource, booksDestination);
        System.out.println("Size:" + booksDestination.size());
    }


    public static void copyToBooks(List<? extends Book> src, List<? super Book> dest) {
        for (Book book : src) {
            dest.add(book);
        }
    }

}
class Book{

}
class Album extends Book{

}


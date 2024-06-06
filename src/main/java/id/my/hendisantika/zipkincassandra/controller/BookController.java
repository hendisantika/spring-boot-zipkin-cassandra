package id.my.hendisantika.zipkincassandra.controller;

import id.my.hendisantika.zipkincassandra.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-zipkin-cassandra
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/6/24
 * Time: 07:16
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/v1/book")
@RequiredArgsConstructor
public class BookController {

    private final static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book(1L, "Lord of The Ring", "J.R.R. Tolkien"));
        books.add(new Book(2L, "Harry Potter", "JK. Rowling"));
        books.add(new Book(3L, "The Hunger Game", "Suzanne Collins"));
        books.add(new Book(4L, "Angels & Demons", "Dan Brown"));
    }

}

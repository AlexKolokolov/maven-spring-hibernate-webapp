package ua.djhans.dao;

import ua.djhans.model.Book;
import ua.djhans.model.Writer;

import java.util.List;

/**
 * Created by Administrator on 19.12.2015.
 */
public interface DAO {

    List<Writer> getWriters();

    List<Book> getBooks(int authorId);
}

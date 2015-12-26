package ua.djhans.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.djhans.dao.DAO;
import ua.djhans.model.Book;
import ua.djhans.model.Writer;

import java.util.List;

/**
 * Created by Administrator on 20.12.2015.
 */

public class DaoService {

    private static DaoService instance;
    private DAO dao;

    private DaoService() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springConfig.xml"});
        dao = (DAO)context.getBean("dao");
    }

    public static DaoService getInstance() {
        if (instance == null) instance = new DaoService();
        return instance;
    }

    public List<Book> getBooks(int authorId) {
        return dao.getBooks(authorId);
    }

    public List<Writer> getWriters() {
        return dao.getWriters();
    }

    public static void main(String[] args) {

        List<Writer> writers = DaoService.getInstance().getWriters();
        System.out.println(writers);
    }

}

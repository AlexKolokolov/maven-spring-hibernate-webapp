package ua.djhans.servlets;

import ua.djhans.model.Book;
import ua.djhans.service.DaoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * Created by Administrator on 08.12.2015.
 */
public class Books extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int authorId = Integer.parseInt(req.getParameter("author_id"));

        Collection<Book> books = DaoService.getInstance().getBooks(authorId);

        req.setAttribute("books", books);
        req.getRequestDispatcher("books.jsp").forward(req,resp);
    }
}

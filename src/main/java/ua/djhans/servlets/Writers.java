package ua.djhans.servlets;

import ua.djhans.model.Writer;
import ua.djhans.service.DaoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * Created by Administrator on 09.12.2015.
 */
public class Writers extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Collection<Writer> writers = DaoService.getInstance().getWriters();

        req.setAttribute("writers", writers);
        req.getRequestDispatcher("writers.jsp").forward(req,resp);
    }
}

package ua.djhans.dao;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.djhans.model.Book;
import ua.djhans.model.Writer;

import java.util.List;


/**
 * Created by Administrator on 09.12.2015.
 */
@Repository
public class HibernateDAO implements DAO {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public List<Book> getBooks(int authorId) {
        Session s = sessionFactory.getCurrentSession();
        Criteria criteria = s.createCriteria(Book.class);
        if (authorId != 0) criteria.add(Restrictions.eq("writer.id", authorId));
        return criteria.list();
    }

    @Transactional
    @Override
    public List<Writer> getWriters() {
        Session s = sessionFactory.getCurrentSession();
        return s.createCriteria(Writer.class).list();
    }
}

package ua.djhans;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.Assert;
import ua.djhans.service.DaoService;

/**
 * Created by Administrator on 01.01.2016.
 */
public class AppTest {

    private static final Logger logger = Logger.getLogger(AppTest.class);

    @Test
    public void getBooksTest() {
        String titleEn = DaoService.getInstance().getBooks(1).get(0).getTitleEn();
        Assert.assertEquals("A Daughter of the Snows", titleEn);
    }

    @Test
    public void getWritersTest() {
        String nameRus = DaoService.getInstance().getWriters().get(0).getNameRus();
        Assert.assertEquals("Джек Лондон", nameRus);
    }

}

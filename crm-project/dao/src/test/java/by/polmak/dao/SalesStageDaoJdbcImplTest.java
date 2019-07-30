package by.polmak.dao;

import by.polmak.model.SalesStage;
import by.polmak.dao.SalesStageDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:test-db.xml", "classpath*:test-dao.xml"})
public class SalesStageDaoJdbcImplTest {

    @Autowired
    SalesStageDao salesStageDao;

    @Test
    public void add() {
        SalesStage testSalesStage = new SalesStage();
        testSalesStage.setSalesStageName("SUCCESS");
        SalesStage newSalesStage = salesStageDao.add(testSalesStage);
        assertNotNull(newSalesStage.getSalesStageName());
    }
}

import edu.berkeley.cs.jqf.fuzz.Fuzz;
import edu.berkeley.cs.jqf.fuzz.JQF;
import org.example.demo.Logic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(JQF.class)
public class LogicTest {

    final static Logger LOG = LoggerFactory.getLogger(LogicTest.class);
    private Logic logic;

    @Before
    public void init() {
        LOG.debug("startup");
        logic = new Logic();
    }


    @Fuzz
    public void testInsert(int i, int number) {
        logic.insertNumber(i, number);
        LOG.info("insert ok");
    }

    @Fuzz
    public void testLeapYear(int year) {
        boolean leapyear = logic.isLeapYear(year);
        LOG.info("{} is leap year: {}", year, leapyear);
    }

    @Test
    //banaler Unit Test
    public void testLeapYear2() {
        boolean isLeapyear;

        //Schaltjahr
        int leapYear1 = 2020;
        int leapYear2 = 2400;

        //kein Schaltjahr
        int noLeapYear = 2021;

        //Prüfe: 2020 ist ein Schaltjahr
        isLeapyear = logic.isLeapYear(leapYear1);
        Assert.assertTrue("Assert true " + leapYear1, isLeapyear);

        //Prüfe: 2400 ist ein Schaltjahr
        isLeapyear = logic.isLeapYear(leapYear2);
        Assert.assertTrue("Assert true " + leapYear2, isLeapyear);

        //Prüfe: 2021 ist kein Schaltjahr
        isLeapyear = logic.isLeapYear(noLeapYear);
        Assert.assertFalse("Assert false " + noLeapYear, isLeapyear);
    }

}

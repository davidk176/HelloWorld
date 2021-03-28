import com.pholser.junit.quickcheck.generator.Size;
import edu.berkeley.cs.jqf.fuzz.Fuzz;
import edu.berkeley.cs.jqf.fuzz.JQF;
import org.example.demo.Logic;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

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
    public void test(int i, int number) {
        logic.insertNumber(i, number);
        LOG.info("insert ok");
    }


    @Fuzz
    public void testWithSequence(InputStream in) throws IOException {
     /*   ModelReader reader = new DefaultModelReader();
        Model model = reader.read(in, null);
        Assert.assertNotNull(model);*/
    }
}

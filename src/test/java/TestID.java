import junit.framework.TestCase;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestID extends TestCase {

    @Test
    @Parameters(method="idNumber")
    public void testIfIDIsCorrect(String id,boolean isCorrect){
        assertEquals(IDValidation.validateID(id),isCorrect);
    }

    private Object[] idNumber() {
        return new Object[]{
                new Object[]{"ARB414089",true},
                new Object[]{"ARB414088",false}
        };
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method="IdNumberIllegalArguments")
    public void testIfIdIsCorrectWithIllegalArguments(String id,boolean isCorrect){
        assertEquals(IDValidation.validateID(id),isCorrect);

    }

    private Object[] IdNumberIllegalArguments() {
        return new Object[]{
                new Object[]{"gggggggggg",false},
                new Object[]{"90&G44P",false},
        };
    }
}

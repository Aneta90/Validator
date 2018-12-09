import junit.framework.TestCase;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestPesel extends TestCase {

    @Test
    @Parameters(method="peselNumber")
    public void testIfPeselIsCorrect(String pesel,boolean isCorrect){
        assertEquals(PeselValidation.validatePesel(pesel),isCorrect);
    }

    private Object[] peselNumber() {
        return new Object[]{
                new Object[]{"90062509887",true},
                new Object[]{"11122233344",false}
        };
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method="peselNumberIllegalArguments")
    public void testIfPeselIsCorrectWithIllegalArguments(String pesel,boolean isCorrect){
        assertEquals(PeselValidation.validatePesel(pesel),isCorrect);

    }

    private Object[] peselNumberIllegalArguments() {
        return new Object[]{
                new Object[]{"gggggggggg",false},
                new Object[]{"90&G44P",false},
        };
    }
}

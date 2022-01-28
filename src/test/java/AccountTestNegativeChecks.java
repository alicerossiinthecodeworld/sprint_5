import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTestNegativeChecks {


    public void checkNonValidName(String name){
        Account account = new Account((name));
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void maxLengthTest(){
        checkNonValidName("Тимотеееееееееей Шеврол");

    }

    @Test
    public void minLengthTest(){
        checkNonValidName("П В");
    }

    @Test
    public void noSpacesInTheBeginningTest(){
        checkNonValidName(" Тимотей Шевроле");
    }

    @Test
    public void noSpacesInTheEndTest(){
        checkNonValidName("Тимотей Шевроле ");

    }

    @Test
    public void onlyOneSpaceInTheMiddleTest(){
        checkNonValidName("Тимотей  Шевроле");
    }

    @Test(expected=NullPointerException.class)
    public void nullRaisesException() {
        checkNonValidName(null);
    }
}


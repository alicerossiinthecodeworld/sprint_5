import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;;

public class AccountTest {


    @Test
    public void maxLengthTest(){
        Account account = new Account(("Тимотеееееееееей Шеврол"));
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void minLengthTest(){
        Account account = new Account("П В");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void noSpacesInTheBeginningTest(){
        Account account = new Account(" Тимотей Шевроле");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void noSpacesInTheEndTest(){
        Account account = new Account("Тимотей Шевроле ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void onlyOneSpaceInTheMiddleTest(){
        Account account = new Account("Тимотей  Шевроле");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void validNamePasses(){
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

}

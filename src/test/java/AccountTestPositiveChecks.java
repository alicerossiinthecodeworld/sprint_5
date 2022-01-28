import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class AccountTestPositiveChecks {

    private final String name;

    public AccountTestPositiveChecks(String name) {
        this.name = name;
    }
    @Parameterized.Parameters
    public static Object[][] dataForTest() {
        return new Object[][] {
                {"Тимоти Шаламе"},
                {"Аа В"},
                {"Тимоооо Шаламммеее"},
                {"Тимоти Шал"},
                {"Тим Ша"}
        };
    }

    @Test
    public void validNamePasses(){
        Account account = new Account(name);
        assertTrue(account.checkNameToEmboss());
    }
}

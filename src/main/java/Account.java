import java.io.*;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (this.name.length() > 3 && this.name.length() < 19) {
            return this.name.matches("^[а-яА-я]+(\s)[а-яА-Я]+$");
        }
        return false;
    }

}
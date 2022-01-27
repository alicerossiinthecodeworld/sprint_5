public class Praktikum {

    public static void main(String[] args) {
        Account acc1 = new Account("Тимоти Шаламе");
        Account acc2 = new Account("ТимотейШеврол");
        Account acc3 = new Account("П В");
        Account acc4 = new Account("Тимотеееееееееей Шеврол");
        Account acc5 = new Account(" Тимотей Шевроле");
        Account acc6 = new Account("Тимотей Шевроле ");

        System.out.println(acc1.checkNameToEmboss());
        System.out.println(acc2.checkNameToEmboss());
        System.out.println(acc3.checkNameToEmboss());
        System.out.println(acc4.checkNameToEmboss());
        System.out.println(acc5.checkNameToEmboss());
        System.out.println(acc6.checkNameToEmboss());
    }
}
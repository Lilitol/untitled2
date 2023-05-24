// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int initialBalance = 1300;
        int addend = 800;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }

        // Int bonus = addend > 1000 ? addend / 100 : 0;

        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}

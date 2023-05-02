public class Main {
    public static void main(String[] args) {
        int check = 100;
        int pay = 2000;

        int bonus;
        if (pay > 1000) {
            bonus = pay / 100;
            ;
        } else {
            bonus = 0;
        }
        int finalСheck = pay + check + bonus;
        System.out.println("Итоговый счёт: " + finalСheck);

    }
}
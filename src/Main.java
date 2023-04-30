public class Main {
    public static void main(String[] args) {
        int check = 100;
        int pay = 2000;

        int bonus;
        if (pay > 1000) {
            bonus = check + pay / 100;
            ;
        } else {
            bonus = 0;
        }
        int y = pay + check + bonus;
        System.out.println("Итоговый счёт: " + y);

    }
}
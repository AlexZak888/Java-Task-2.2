public class Main {
    public static void main(String[] args) {

        int check = 1000;
        int replenishment = 2000;
        int bonus = replenishment / 100;

        if (replenishment > 1000) {
            System.out.println("Итоговый счёт: " + (check + replenishment + bonus));
            System.out.println("Количество бонусных рублей: " + bonus);
        } else {
            System.out.println("Итоговый счёт: " + (check + replenishment));
            System.out.println("Количество бонусных рублей: 0");
        }

    }
}
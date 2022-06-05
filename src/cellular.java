public class cellular {
    public static void main(String[] args) {
        int refill = 1100;  // сумма пополнения

        int amount = 100; // исходная сумма на счете
        int bonusFor100 = 1;  // количество бонусов за каждые 100 рублей

        int balance; // итоговый баланс
        int points;  // количество бонусов начислено
        if (refill >= 1000) {
            points = bonusFor100 * refill / 100;
            balance = amount + refill + points;
        } else {
            points = 0;
            balance = amount + refill;
        }

        System.out.println("Итоговая сумма на счету:");
        System.out.println(balance);
        System.out.println("Бонус равен:");
        System.out.println(points);
    }
}

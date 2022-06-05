public class cellular {
    public static void main(String[] args) {
        int amount = 100; // исходная сумма на счете
        int bonus = 1;  // количество бонусов за каждые 100 рублей

        int refill = 100;  // сумма пополнения

        int balance; // итоговый баланс
        int points;  // количество бонусов начислено
        if (amount >= 1000) {
            points = bonus * amount / refill;
            balance = amount + refill + points;
        } else {
            points = 0;
            balance = amount + refill;
        }

        System.out.println("Баланс вашего счета:");
        System.out.println(balance);
        System.out.println("Бонусов получено:");
        System.out.println(points);
    }
}

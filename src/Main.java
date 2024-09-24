//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int replenishment = 1100;
        // пополнение

        // бонус в 100 р
        int initialAccount = 100;
        // начальный счет


        { if (replenishment > 1000) {

            System.out.printf("Начислено бонусов: " + (replenishment / 100) + ", остаток на счете: " + (initialAccount + replenishment / 100 + replenishment));
        }
        else
            System.out.println("Остаток на счете: " + (initialAccount + replenishment)); }
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}

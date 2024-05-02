import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int fundsAccount = 100;//средства на счете
        int amountDeposit = 1100;// сумма пополнения
        int initAmountBonus = 0;//начальная сумма бонусов
        int depositBonus = amountDeposit / 100 * 1;//бонусы за пополнение
        int totalAmountBonus = initAmountBonus + depositBonus;//итоговая сумма бонусов
        int amountAccount = fundsAccount + amountDeposit + totalAmountBonus;//итоговая сумма на счете с бонусами
        if (amountDeposit > 1000) {
            System.out.println(totalAmountBonus);//колличество бонусных рублей
            System.out.println(amountAccount);//сумма на счете
        } else {
            System.out.println(initAmountBonus);//бонусы
            System.out.println(fundsAccount + amountDeposit);//сумма на счете

        }


    }
}
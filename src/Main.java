import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int srNaSchet = 100;//средства на счете
        int sumPopln = 1100;// сумма пополнения
        int nacSumBon = 0;//начальная сумма бонусов
        int bonZaPopol = sumPopln / 100 * 1;//бонусы за пополнение
        int itogSumBon = nacSumBon + bonZaPopol;//итоговая сумма бонусов
        int sumNaScete = srNaSchet + sumPopln + itogSumBon;//итоговая сумма на счете с бонусами
        if (sumPopln > 1000) {
            System.out.println(itogSumBon);//колличество бонусных рублей
            System.out.println(sumNaScete);//сумма на счете
        } else {
            System.out.println(nacSumBon);//бонусы
            System.out.println(srNaSchet + sumPopln);//сумма на счете

        }


    }
}
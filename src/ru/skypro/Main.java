package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// TASK 1
        byte a = -5;
        short b = 30_000;
        int c = 2_000_000_000;
        long d = -11_111_111_111L;
        float e = 3.1111113f;
        double f = 3.345678901;
        System.out.println (a);
        System.out.println (b);
        System.out.println (c);
        System.out.println (d);
        System.out.println (e);
        System.out.println (f);

    //TASK2//
        float Boxer1Weight = 78.2f;
        float Boxer2Weight = 82.7f;
        float BoxersWeight = Boxer1Weight+Boxer2Weight;
        float WeightDifference = Boxer2Weight-Boxer1Weight;
        System.out.println("Вес обоих спортсменов " +BoxersWeight + "кг");
        System.out.println ("Разница в весе спортсменов "+WeightDifference+" кг");

    //TASK3//

        byte BananaWeight = 80;
        byte MilkWeight = 105;
        byte IceCreamWeight = 100;
        byte EggWeight = 70;
        float BreakfastWeight = BananaWeight*5 + MilkWeight*2 + IceCreamWeight*2 + EggWeight*4;
        System.out.println("Завтрак весит " + BreakfastWeight/1000 + " кг");

    //TASK4//

        byte WeightToLose = 7;
        int DailyLoss1 = 250;
        int DailyLoss2 = 500;
        int DaysForLoss1 = WeightToLose*1000/DailyLoss1;
        int DaysForLoss2 = WeightToLose*1000/DailyLoss2;
        int DaysAverage = WeightToLose*1000/((DailyLoss1+DailyLoss2)/2); //не считает цифры после запятой, даже с типоами переменной с плавающей точкой??//
        System.out.println("При сбросе 250г в день спортсмен будет худеть "+ DaysForLoss1+" дней, а при сбросе 500 г в день спортсмен будет худеть "+DaysForLoss2+" дней.");
        System.out.println("В среднем на похудение спортсмену потребуется "+DaysAverage+" дней.");

    //TASK5//

        int SalaryMashaOld = 67760;
        int SalaryMashaAnnualOld = SalaryMashaOld*12;
        float SalaryMashaNew = SalaryMashaOld*1.1f;
        float SalaryMashaAnnualNew = SalaryMashaNew*12f;
        float SalaryDifferenceMasha = SalaryMashaAnnualNew-SalaryMashaAnnualOld;
        int SalaryDenisOld = 83690;
        int SalaryDenisAnnualOld = SalaryDenisOld*12;
        float SalaryDenisNew = SalaryDenisOld*1.1f;
        float SalaryDenisAnnualNew = SalaryDenisNew*12f;
        float SalaryDifferenceDenis = SalaryDenisAnnualNew-SalaryDenisAnnualOld;
        int SalaryKristinaOld = 76230;
        int SalaryKristinaAnnualOld = SalaryKristinaOld*12;
        float SalaryKristinaNew = SalaryKristinaOld*1.1f;
        float SalaryKristinaAnnualNew = SalaryKristinaNew*12f;
        float SalaryDifferenceKristina = SalaryKristinaAnnualNew-SalaryKristinaAnnualOld;
        System.out.println("В следующем году зарплата Маши составит "+SalaryMashaNew+" рублей в месяц, а ее годовой доход вырастет на "+SalaryDifferenceMasha+" рублей.");
        System.out.println("В следующем году зарплата Дениса составит "+SalaryDenisNew+" рублей в месяц, а его годовой доход вырастет на "+SalaryDifferenceDenis+" рублей.");
        System.out.println("В следующем году зарплата Кристины составит "+SalaryKristinaNew+" рублей в месяц, а ее годовой доход вырастет на "+SalaryDifferenceKristina+" рублей.");


    }

}

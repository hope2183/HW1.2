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

        int ConversionToKg = 1000;
        int BananaWeight = 80;
        int BananaQty = 5;
        int MilkWeight = 105;
        int MilkWeightML = 200;
        int MilkQty = MilkWeightML/100;
        int IceCreamWeight = 100;
        int IceCreamQty = 2;
        int EggWeight = 70;
        int EggQty = 4;
        float BreakfastWeight = BananaWeight*BananaQty + MilkWeight*MilkQty + IceCreamWeight*IceCreamQty + EggWeight*EggQty;
        System.out.println("Завтрак весит " + BreakfastWeight/ConversionToKg + " кг");

    //TASK4//

        byte WeightToLose = 7;
        int DailyLoss1 = 250;
        int DailyLoss2 = 500;
        int DaysForLoss1 = WeightToLose*ConversionToKg/DailyLoss1;
        int DaysForLoss2 = WeightToLose*ConversionToKg/DailyLoss2;
        float DaysAverage = WeightToLose*ConversionToKg/((DailyLoss1+DailyLoss2)/2.0f);
        //or//
        int DaysAverage2 = (DaysForLoss1+DaysForLoss2)/2;
        System.out.println("При сбросе 250г в день спортсмен будет худеть "+ DaysForLoss1+" дней, а при сбросе 500 г в день спортсмен будет худеть "+DaysForLoss2+" дней.");
        System.out.println("В среднем на похудение спортсмену потребуется "+DaysAverage+" дней.");
        System.out.println("В среднем на похудение спортсмену потребуется "+DaysAverage2+" дней.");
    //TASK5//

        int PercentForIncrease = 10;
        float IncreaseCoefficient = 1+(PercentForIncrease/100f);
        //System.out.println(IncreaseCoefficient);
        int SalaryMashaOld = 67760;
        int SalaryMashaAnnualOld = SalaryMashaOld*12;
        float SalaryMashaNew = SalaryMashaOld*IncreaseCoefficient;
        float SalaryMashaAnnualNew = SalaryMashaNew*12f;
        float SalaryDifferenceMasha = SalaryMashaAnnualNew-SalaryMashaAnnualOld;
        int SalaryDenisOld = 83690;
        int SalaryDenisAnnualOld = SalaryDenisOld*12;
        float SalaryDenisNew = SalaryDenisOld*IncreaseCoefficient;
        float SalaryDenisAnnualNew = SalaryDenisNew*12f;
        float SalaryDifferenceDenis = SalaryDenisAnnualNew-SalaryDenisAnnualOld;
        int SalaryKristinaOld = 76230;
        int SalaryKristinaAnnualOld = SalaryKristinaOld*12;
        float SalaryKristinaNew = SalaryKristinaOld*IncreaseCoefficient;
        float SalaryKristinaAnnualNew = SalaryKristinaNew*12f;
        float SalaryDifferenceKristina = SalaryKristinaAnnualNew-SalaryKristinaAnnualOld;
        System.out.println("В следующем году зарплата Маши составит "+SalaryMashaNew+" рублей в месяц, а ее годовой доход вырастет на "+SalaryDifferenceMasha+" рублей.");
        System.out.println("В следующем году зарплата Дениса составит "+SalaryDenisNew+" рублей в месяц, а его годовой доход вырастет на "+SalaryDifferenceDenis+" рублей.");
        System.out.println("В следующем году зарплата Кристины составит "+SalaryKristinaNew+" рублей в месяц, а ее годовой доход вырастет на "+SalaryDifferenceKristina+" рублей.");


    }

}

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
        char g = 177; // результат в консоли отличается от того, что в таблице знаков//
        boolean h = true; //не понятно, как использовать самостоятельно, без если, например //
        System.out.println (a);
        System.out.println (b);
        System.out.println (c);
        System.out.println (d);
        System.out.println (e);
        System.out.println (f);
        System.out.println (g);
        System.out.println (h);

    //TASK2//
        float boxer1Weight = 78.2f;
        float boxer2Weight = 82.7f;
        float boxersWeight = boxer1Weight+boxer2Weight;
        float weightDifference = boxer2Weight-boxer1Weight;
        System.out.println("Вес обоих спортсменов " +boxersWeight + "кг");
        System.out.println ("Разница в весе спортсменов "+weightDifference+" кг");

    //TASK3//

        int conversionToKg = 1000;
        int bananaWeightGr = 80;
        int bananaQty = 5;
        int milkWeight100Ml = 105;
        int milkVolumeML = 200;
        int milkPortion = milkVolumeML/100;
        int iceCreamWeightGr = 100;
        int iceCreamQty = 2;
        int eggWeightGr = 70;
        int eggQty = 4;
        float breakfastWeightGr = bananaWeightGr*bananaQty + milkWeight100Ml*milkPortion + iceCreamWeightGr*iceCreamQty + eggWeightGr*eggQty;
        System.out.println("Завтрак весит " + breakfastWeightGr/conversionToKg + " кг");

    //TASK4//

        int weightToLoseKg = 7;
        int weightToLoseGr = weightToLoseKg*conversionToKg;
        int dailyLossGr1 = 250;
        int dailyLossGr2 = 500;
        int daysForLoss1 = weightToLoseGr/dailyLossGr1;
        int daysForLoss2 = weightToLoseGr/dailyLossGr2;
        float daysAverage = weightToLoseGr/((dailyLossGr1+dailyLossGr2)/2.0f);
        //or//
        int daysAverage2 = (daysForLoss1+daysForLoss2)/2;
        System.out.println("При сбросе 250г в день спортсмен будет худеть "+ daysForLoss1+" дней, а при сбросе 500 г в день спортсмен будет худеть "+daysForLoss2+" дней.");
        System.out.println("В среднем на похудение спортсмену потребуется "+daysAverage+" дней.");
        System.out.println("В среднем на похудение спортсмену потребуется "+daysAverage2+" дней.");
    //TASK5//

        int percentForIncrease = 10;
        float increaseCoefficient = 1+(percentForIncrease/100f);
        //System.out.println(increaseCoefficient);
        int salaryMashaOld = 67760;
        int salaryMashaAnnualOld = salaryMashaOld*12;
        float salaryMashaNew = salaryMashaOld*increaseCoefficient;
        float salaryMashaAnnualNew = salaryMashaNew*12f;
        float salaryDifferenceMasha = salaryMashaAnnualNew-salaryMashaAnnualOld;
        int salaryDenisOld = 83690;
        int salaryDenisAnnualOld = salaryDenisOld*12;
        float salaryDenisNew = salaryDenisOld*increaseCoefficient;
        float salaryDenisAnnualNew = salaryDenisNew*12f;
        float salaryDifferenceDenis = salaryDenisAnnualNew-salaryDenisAnnualOld;
        int salaryKristinaOld = 76230;
        int salaryKristinaAnnualOld = salaryKristinaOld*12;
        float salaryKristinaNew = salaryKristinaOld*increaseCoefficient;
        float salaryKristinaAnnualNew = salaryKristinaNew*12f;
        float salaryDifferenceKristina = salaryKristinaAnnualNew-salaryKristinaAnnualOld;
        System.out.println("В следующем году зарплата Маши составит "+salaryMashaNew+" рублей в месяц, а ее годовой доход вырастет на "+salaryDifferenceMasha+" рублей.");
        System.out.println("В следующем году зарплата Дениса составит "+salaryDenisNew+" рублей в месяц, а его годовой доход вырастет на "+salaryDifferenceDenis+" рублей.");
        System.out.println("В следующем году зарплата Кристины составит "+salaryKristinaNew+" рублей в месяц, а ее годовой доход вырастет на "+salaryDifferenceKristina+" рублей.");


    }

}

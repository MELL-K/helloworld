public class Main {
    public static void main(String[] args) {

        // Переменные: типы и выбор

        System.out.println("Задача 1");
        byte variablOne = 2;
        System.out.println("Значение переменной variableOne с типом byte равно " + variablOne);
        short variablTwo = 1000;
        System.out.println("Значение переменной variableTwo с типом short равно " + variablTwo);
        int variablThree = 1000000;
        System.out.println("Значение переменной variableThree с типом int равно " + variablThree);
        long variablFore = 356L;
        System.out.println("Значение переменной variableFore с типом long равно " + variablFore);
        float variablFive = 3.56f;
        System.out.println("Значение переменной variableFive с типом float равно " + variablFive);
        double variablSix = 3.568;
        System.out.println("Значение переменной variableSix с типом double равно " + variablSix);

        System.out.println("Задача 2");
        float one = 27.12f;
        long two = 987678965549L;
        float three = 2.786f;
        short fore = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(fore);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);

        System.out.println("Задача 3");
        byte oneClass = 23;
        byte twoClass = 27;
        byte threeClass = 30;
        short paperTotal = 480;
        int paperStudent = paperTotal / (oneClass + twoClass + threeClass);
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");

        System.out.println("Задача 4");
        byte bottles = 16;
        byte time = 2;
        System.out.println("За " + time + " минуты машина произвела " + bottles + " штук бутылок");

        byte bottleInMinute = 16 / 2;

        int time1 = 20;
        System.out.println("За " + time1 + " минут машина произвела " + time1 * bottleInMinute + " штук бутылок");
        int time2 = 24 * 60;
        System.out.println("За " + time2 + " минут машина произвела " + time2 * bottleInMinute + " штук бутылок");
        int time3 = time2 * 3;
        System.out.println("За " + time3 + " минут машина произвела " + time3 * bottleInMinute + " штук бутылок");
        int time4 = time2 * 30;
        System.out.println("За " + time4 + " минут машина произвела " + time4 * bottleInMinute + " штук бутылок");

        System.out.println("Задача 5");
        byte paintCount = 120;
        byte paintWhite = 2;
        byte paintBrown = 4;
        int classCount = paintCount / (paintWhite + paintBrown);
        System.out.println("В школе, где " + classCount + " классов, нужно " + paintWhite * classCount + " банок белой краски и " + paintBrown * classCount + " банок коричневой краски");

        System.out.println("Задача 6");
        byte banana1 = 80;
        byte milk100 = 105;
        byte iceCream1 = 100;
        byte egg1 = 70;
        int coctailGr = banana1 * 5 + milk100 * 2 + iceCream1 * 2 + egg1 * 4;
        float coctailKg = coctailGr / 1000f;
        System.out.println("Вес коктейля составляет " + coctailGr + " граммов");
        System.out.println("Вес коктейля составляет " + coctailKg + " кг");

        System.out.println("Задача 7");
        byte weight = 7;
        short day1 = 250;
        short day2 = 500;
        int var1 = weight * 1000 / day1;
        int var2 = weight * 1000 / day2;
        float var3 = weight * 1000 / ((day1 + day2) / 2f);

        System.out.println("При потери " + day1 + "гр в день для похудения на " + weight + "кг потребуется " + var1 + " дней");
        System.out.println("При потери " + day2 + "гр в день для похудения на " + weight + "кг потребуется " + var2 + " дней");
        System.out.println("Для похудения на " + weight + "кг в среднем потребуется " + var3 + " дней");

        System.out.println("Задача 8");
        int employee1 = 67760;
        int employee2 = 83690;
        int employee3 = 76230;
        int employee1Year = employee1 * 12;
        int employee1New = employee1 / 10 + employee1;
        int employee2Year = employee2 * 12;
        int employee2New = employee2 / 10 + employee2;
        int employee3Year = employee3 * 12;
        int employee3New = employee3 / 10 + employee3;
        System.out.println("Маша теперь получает " + employee1New + " рублей. Годовой доход вырос на " + (employee1New * 12 - employee1Year) + "рублей");
        System.out.println("Денис теперь получает " + employee2New + " рублей. Годовой доход вырос на " + (employee2New * 12 - employee2Year) + "рублей");
        System.out.println("Кристина теперь получает " + employee3New + " рублей. Годовой доход вырос на " + (employee3New * 12 - employee3Year) + "рублей");

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Привет мир!");
        System.out.printf("Hello world!");
        System.out.printf("Привет Мир!");

        // Переменные и синтаксис

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog=" + dog);
        System.out.println("cat=" + cat);
        System.out.println("paper=" + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog=" + dog);
        System.out.println("cat=" + cat);
        System.out.println("paper=" + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog=" + dog);
        System.out.println("cat=" + cat);
        System.out.println("paper=" + paper);

        var friend = 19;
        System.out.println("friend=" + friend);
        friend = friend + 2;
        System.out.println("friend=" + friend);
        friend = friend / 7;
        System.out.println("friend=" + friend);

        var frog = 3.5;
        System.out.println("frog=" + frog);
        frog = frog * 10;
        System.out.println("frog=" + frog);
        frog = frog / 3.5;
        System.out.println("frog=" + frog);
        frog = frog + 4;
        System.out.println("frog=" + frog);

        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var boxers = boxerOne + boxerTwo;
        System.out.println("Total weight of boxers =" + boxers);
        System.out.println("The difference in the weight of boxers =" + (boxerTwo - boxerOne));
        System.out.println("Remains=" + (boxerTwo % boxerOne));

        var timeTotal = 640;// всего часов работы
        var staff = 8; // часов работы на одного сотрудника
        var allstaff = timeTotal / staff; // всего работников
        System.out.println("Всего работников в компании — " + allstaff + " человек");
        System.out.println("Если в компании работает " + (allstaff + 94) + " человек, " + "то всего  " + (staff * (allstaff + 94)) + " часов работы может быть поделено между сотрудниками");

        // Переменные: типы и выбор

        System.out.println("Задача 1");
        byte variableOne = 2;
        System.out.println("Значение переменной variableOne с типом byte равно " + variableOne);
        short variableTwo = 1000;
        System.out.println("Значение переменной variableTwo с типом short равно " + variableTwo);
        int variableThree = 1000000;
        System.out.println("Значение переменной variableThree с типом int равно " + variableThree);
        long variableFore = 356L;
        System.out.println("Значение переменной variableFore с типом long равно " + variableFore);
        float variableFive = 3.56f;
        System.out.println("Значение переменной variableFive с типом float равно " + variableFive);
        double variableSix = 3.568;
        System.out.println("Значение переменной variableSix с типом double равно " + variableSix);

        System.out.println("Задача 2");
        float varOne = 27.12f;
        long varTwo = 987678965549L;
        float varThree = 2.786f;
        short varFore = 569;
        short varFive = -159;
        short vareSix = 27897;
        byte vareSeven = 67;

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
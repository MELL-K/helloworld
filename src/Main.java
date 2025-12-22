//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Привет мир!");
        System.out.printf("Hello world!");
        System.out.printf("Привет Мир!");

    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
    System.out.println("dog="+dog);
    System.out.println("cat="+cat);
    System.out.println("paper="+paper);

        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        var friend=19;
        System.out.println("friend="+friend);
            friend=friend+2;
            System.out.println("friend="+friend);
                friend=friend/7;
                System.out.println("friend="+friend);

    var frog=3.5;
        System.out.println("frog="+frog);
        frog=frog*10;
        System.out.println("frog="+frog);
        frog=frog/3.5;
        System.out.println("frog="+frog);
        frog=frog+4;
        System.out.println("frog="+frog);

    var boxer_1=78.2;
    var boxer_2=82.7;
    var boxers=boxer_1+boxer_2;
        System.out.println("Total weight of boxers ="+boxers);
        System.out.println("The difference in the weight of boxers ="+(boxer_2-boxer_1));
        System.out.println("Remains="+(boxer_2%boxer_1));

    var time=640;// всего часов работы
    var staff=8; // часов работы на одного сотрудника
    var allstaff=time/staff; // всего работников
        System.out.println("Всего работников в компании — "+allstaff+" человек");
        System.out.println("Если в компании работает "+(allstaff+94)+" человек, "+"то всего  "+(time/(allstaff+94))+" часов работы может быть поделено между сотрудниками");
    }

}
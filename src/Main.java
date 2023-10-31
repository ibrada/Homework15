public class Main {

    public static void line() {
        System.out.println("* * * * *");
    }

    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри Поттер", 30, 40, 50, 40, 30);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 25, 35, 45, 55, 15);
        Gryffindor ron = new Gryffindor("Рон Уизли", 57, 47, 37, 27, 17);

        Hufflepuff zachariah = new Hufflepuff("Захария Смит", 19, 29, 39, 49, 19);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 28, 38, 48, 58, 28);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 36, 46, 36, 26, 16);

        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 24, 44, 34, 34, 14, 24);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 21, 31, 51, 41, 31, 21);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 32, 22, 52, 42, 22, 22);

        Slytherin draco = new Slytherin("Драко Малфой", 58, 34, 28, 46, 18, 27, 27);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 42, 34, 51, 27, 49, 24, 23);
        Slytherin gregory = new Slytherin("Грегори Гойл", 43, 23, 53, 53, 33, 21, 24);

        line();

        harry.print();
        hermione.print();
        ron.print();
        zachariah.print();
        cedric.print();
        justin.print();
        zhou.print();
        padma.print();
        marcus.print();
        draco.print();
        graham.print();
        gregory.print();

        line();

        harry.compareTo(hermione);
        zachariah.compareTo(cedric);
        padma.compareTo(marcus);
        graham.compareTo(gregory);

        line();

        ron.compareTo(justin);
        zhou.compareTo(draco);

        line();


    }
}
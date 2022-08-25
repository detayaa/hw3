import java.security.Key;

public class Main {
    public static void main(String[] args) {
    System.out.println("Первое задание");
    int first = 340957;
    byte second = 23;
    long third = -38538475L;
    float fourth = 2398.42039f;
    double fifth = 2.3456764346764;
    System.out.println("Значение переменной first с типом int равно " + first);
    System.out.println("Значение переменной second с типом byte равно " + second);
    System.out.println("Значение переменной third с типом long равно " + third);
    System.out.println("Значение переменной fourth с типом float равно " + fourth);
    System.out.println("Значение переменной fifth с типом double равно " + fifth);

        System.out.println("Второе задание");
        float f = 27.12f;
        long l = 987_678_965_549L;
        double d = 2.786;
        boolean b = d >= 3;
        var v = 569;
        short sh = -159;
        int i = 27897;
        byte by = 67;

        System.out.println("Третье задание");
        byte Ludmila = 23;
        byte Anna = 27;
        byte Ekaterina = 30;
        int allPaper = 480;
        float allStudents = (Ludmila + Anna + Ekaterina);
        System.out.println("На каждого ученика рассчитано " + (allPaper / allStudents) + " листов бумаги");

        System.out.println("Четвертое задание");
        byte twoMinutes = 16;
        byte oneMinutes = 16 / 2;
        System.out.println("За 20 минут машина произвела " + (oneMinutes * 20) + " бутылок");
        System.out.println("В сутки машина производит " + ((oneMinutes * 60) * 24) + " бутылок");
        System.out.println("За 3 дня машина произвела " + ((oneMinutes * 60) * (24 * 3)) + " бутылок");
        System.out.println("За 1 месяц машина произвела " + ((oneMinutes * 60) * (24 * 30)) + " бутылок");

        System.out.println("Пятое задание");
        byte canWhite = 2;
        byte canBrown = 4;
        byte allCan = 120;
        int allClasses = allCan / (canWhite + canBrown);
        int countWhite = allClasses * canWhite;
        int countBrown = allClasses * canBrown;
        System.out.println("В школе, где " + allClasses + " классов, нужно " + countWhite + " белой краски и " + countBrown + " банок коричневой краски");







    }
}
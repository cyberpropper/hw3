public class Main {
    public static void main(String[] args) {
        int a = 20000000;
        byte b = 67;
        float c = 27.12f;
        float c2 = 2.786f;
        short d = -159;
        short d1 = 569;
        short d2 = 27897;
        long  e = 987678965549L;
        double f = -1.7976931348623157E308;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(c2);
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(e);
        System.out.println(f);


        double list = 480/(23+27+30);
        System.out.println("На каждого ученика рассчитано " + list + " листов бумаги");


        short in20Minutes = 16*(20/2);
        System.out.println("За 20 минут машина произвела " + in20Minutes + " штук бутылок");
        short inDay = 16*(1440/2);
        System.out.println("За сутки машина произвела " + inDay + " штук бутылок");
        int in3Days = 16*(4320/2);
        System.out.println("За 3 дня машина произвела " + in3Days + " штук бутылок");
        int inMonth = 16*(43200/2);
        System.out.println("За месяц машина произвела " + inMonth + " штук бутылок");


        byte schoolClasses = 120 / (2 + 4);
        byte whiteCans = (byte) (schoolClasses * 2);
        byte brownCans = (byte) (schoolClasses * 4);
        System.out.println("В школе, где " + schoolClasses + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски.");


        int bananas = 5 * 80;
        int milk = (int) (200 / 100.0 * 105);
        int ice = 2 * 100;
        int eggs = 4 * 70;
        int grams = bananas + milk + ice + eggs;
        double Kg = grams / 1000.0;
        System.out.println("Вес: " + grams + " грамм = " + Kg + " килограмм.");


        int gramsAll = 7000;
        int g250 = gramsAll / 250;
        int g500 = gramsAll / 500;
        int days = (g250 + g500) / 2;
        System.out.println("Если спортсмен будет худеть на 250 грамм, то ему понадобится " + g250 + " дней. Если будет худеть на 500 грамм - " + g500 + " дней. В среднем - " + days + " дней.");


        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaPlus = (int) (masha + masha * 0.10);
        int denisPlus = (int) (denis + denis * 0.10);
        int kristinaPlus = (int) (kristina + kristina * 0.10);
        int mashaYear = (mashaPlus * 12) - (masha * 12);
        int denisYear = (denisPlus * 12) - (denis * 12);
        int kristinaYear = (kristinaPlus * 12) - (kristina * 12);
        System.out.println("Маша теперь получает " + mashaPlus + " рублей. Годовой доход вырос на " + mashaYear + " рублей.");
        System.out.println("Денис теперь получает " + denisPlus + " рублей. Годовой доход вырос на " + denisYear + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaPlus + " рублей. Годовой доход вырос на " + kristinaYear + " рублей.");

    }
}
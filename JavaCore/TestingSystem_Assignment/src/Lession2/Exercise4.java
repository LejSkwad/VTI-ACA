package Lession2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise4 {
    public static void question1(){
        Random rand = new Random();
        int i = rand.nextInt();
    }

    public static void question2(){
        Random rand = new Random();
        double i = rand.nextDouble();
    }

    public static void question3(){
        Random rand = new Random();
        List<String> names = new ArrayList<String>();
        names.add("Hieu");
        names.add("Tuan");
        names.add("Duong");
        String i = names.get(rand.nextInt(names.size()));
        System.out.println(i);
    }

    public static void question4(){
        LocalDate startDate = LocalDate.of(1995, 7, 24);
        LocalDate endDate = LocalDate.of(1995, 12, 20);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        long randomDays = ThreadLocalRandom.current().nextLong(daysBetween + 1);

        LocalDate randomDate = startDate.plusDays(randomDays);

        System.out.println("Random date: " + randomDate);
    }

    public static void question5(){
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusYears(1);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        long randomDays = ThreadLocalRandom.current().nextLong(daysBetween + 1);

        LocalDate randomDate = startDate.plusDays(randomDays);

        System.out.println(randomDate);
    }

    public static void question6(){
        LocalDate today = LocalDate.now();
        long randomDays = ThreadLocalRandom.current().nextLong();
        LocalDate randomPastDate = today.minusDays(randomDays);
        System.out.println(randomPastDate);
    }

    public static void question7(){
        Random rand = new Random();
        int random = rand.nextInt(900) + 100; // 0–899 + 100 = 100–999
        System.out.println(random);
    }
}

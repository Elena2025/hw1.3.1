public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!!!");
        }
        if (age < 18) {
            System.out.println("Совершеннолетие ещё не наступило, и нужно немного подождать.");
        }

        // Задача 2
        System.out.println("Задача 2");
        int age_2 = 19;
        if (age_2 >= 7 && age_2 < 18) {
            System.out.println("Ребенок ходит в школу!");
        }
        if (age_2 >= 18 && age_2 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет!");
        }
        if (age_2 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу!");
        }

        // Задача 3
        System.out.println("Задача 3");
        int occupiedPlaces = 50;
        if (occupiedPlaces < 60) {
            System.out.println("В вагоне есть сидячее место.");
        }
        if (occupiedPlaces > 60 && occupiedPlaces < 102) {
            System.out.println("В вагоне есть стоячее место.");
        }
        if (occupiedPlaces > 102) {
            System.out.println("Вагон уже полностью забит!");
        }

        // Задача 4
        System.out.println("Задача 4");
        int age_3 = 15;
        if (age_3 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!!!");
        } else {
            System.out.println("Совершеннолетие ещё не наступило, и нужно немного подождать.");
        }

        // Задача 5
        System.out.println("Задача 5");
        int age_4 = 25;
        if (age_4 >= 7 && age_4 <18) {
            System.out.println("Ребенок ходит в школу!");
        }
        if (age_4 >= 18 && age_4 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет!");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу!");
        }

        // Задача 6
        System.out.println("Задача 6");
        int occupiedPlaces_2 = 50;
        if (occupiedPlaces_2 < 60) {
            System.out.println("В вагоне есть сидячее место.");
        } else
        if (occupiedPlaces_2 > 60 && occupiedPlaces_2 < 102) {
            System.out.println("В вагоне есть стоячее место.");
        } else {
            System.out.println("Вагон уже полностью забит!");
        }

        // Задача 7
        System.out.println("Задача 7");
        int age_5 = 4;
        boolean goToKindergarten = age_5 >= 2 && age_5 <= 6;
        boolean goToSchool = age_5 >= 7 && age_5 <= 18;
        boolean goToUniversity = age_5 >= 18 && age_5 <= 24;
        if (goToKindergarten) {
            System.out.println("Если возраст человека равен " + age_5 + " , то ему нужно ходить в детский сад.");
        } else
        if (goToSchool) {
            System.out.println("Если возраст человека равен " + age_5 + " , то ему нужно ходить в школу.");
        } else
        if (goToUniversity) {
            System.out.println("Если возраст человека равен " + age_5 + " , то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + age_5 + " , то ему нужно ходить на работу.");
        }

        // Задача 8
        System.out.println("Задача 8");
        int age_6 = 15;
        boolean cannotRide = age_6 < 5;
        boolean accompaniedAdult = age_6 >= 5 && age_6 < 14;
        if (cannotRide) {
            System.out.println("Если ребенку " + age_6 + " лет, то ему нельзя кататься на аттракционе.");
        } else
        if (accompaniedAdult) {
            System.out.println("Если ребенку " + age_6 + " лет, то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если ребенку " + age_6 + " лет, то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        // Задача 9
        System.out.println("Задача 9");
        int one = 5;
        int two = 10;
        int three = 15;
        if (one > two && one > three) {
            System.out.println(one + " - бОльшее число.");
        }
        if (two > one && two > three) {
            System.out.println(two + " - бОльшее число.");
        } else {
            System.out.println(three + " - бОльшее число.");
        }

    }
}
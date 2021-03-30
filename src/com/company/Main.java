package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(twoCondition(generateRandomAge(), 18));
        System.out.println(twoCondition(generateRandomAge(), 25));
        System.out.println(twoCondition(56, 13));
        System.out.println(twoCondition(78, 31));
        System.out.println(twoCondition(90, -21));
    }

    public static String twoCondition(int years, int temperature) {
        if (years > 20 && years < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (years < 20 && temperature > 0 && temperature < 28) {
            return "\nМожно идти гулять";
        } else if (years > 45 && temperature > -10 && temperature < 25) {
            return "\nМожно идти гулять";
        } else
            return "\nОставайтесь дома";
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int randomNumber = random.nextInt(80) + 1;
        return randomNumber;
    }
}

/*
#ДЗ:
Создать возвращаемый метод который будет принимать 2 входящих параметра
 - возраст человека и температуру на улице, и возвращать результат в виде строки.
Алгоритм метода должен работать следующим образом:
если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов, то возвращаемый результат - “Можно идти гулять”;
eсли же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов, то результат снова -  “Можно идти гулять”;
а если человеку больше 45 лет, то результат “Можно идти гулять”
формируется только тогда когда на улице температура в диапазоне от -10 до 25 градусов;
В остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
В методе main вызвать написанный метод 5 раз с различными входными данными (аргументами) и распечатать результат в консоль.
ДЗ на сообразительность:
Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
При вызове метода, который формирует результат “можно ли идти гулять”
 использовать генерирование случайного возраста с помощью метода “generateRandomAge”
 */

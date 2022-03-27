package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите 5 слов");
        Scanner sc1 = new Scanner(System.in);
        String words = sc1.nextLine();
        String[] xArray = words.split(" ");
        System.out.println("Какое слово проверить");
        for (; ; ) {
            int number = sc1.nextInt();
            switch (number) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    StringBuilder xBuilder = new StringBuilder(xArray[number - 1]);
                    String x1 = String.valueOf(xBuilder.reverse());
                    if (xArray[number - 1].equals(x1)) {
                        System.out.println("У нас палиндромище!");
                    } else {
                        System.out.println("попробуй другое слово");
                    }
                    break;
                default:
                    System.out.println("Сделайте верный выбор");
            }
        }
    }
}
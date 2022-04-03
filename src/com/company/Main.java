package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите слова");
        Scanner sc1 = new Scanner(System.in);
        String words = sc1.nextLine();
        String[] xArray = words.split(" ");

        System.out.println("Какое слово проверить");
        for (; ; ) {
            int choice = (sc1.nextInt() - 1);
            if (choice >= xArray.length) {
                System.out.println("Этого слова нет, попробуй еще раз");
            } else {
                StringBuilder xBuilder = new StringBuilder(xArray[choice]);
                String x1 = String.valueOf(xBuilder.reverse());
                if (xArray[choice].equals(x1)) {
                    System.out.println("У нас палиндромище!");
                    return;
                } else {
                    System.out.println("попробуй другое слово");
                    break;
                }
            }
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите слова");
        Scanner sc1 = new Scanner(System.in);
        String words = sc1.nextLine();
        String[] xArray = words.split(" ");
        System.out.println("Какое слово проверить");
        String word = sc1.next();
        StringBuilder xBuilder = new StringBuilder(word);
        String x1 = String.valueOf(xBuilder.reverse());
        if (word.equals(x1)) {
            System.out.println("У нас палиндромище!");
        } else {
            System.out.println("попробуй другое слово");
        }
    }
}
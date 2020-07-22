package Strings_Tasks;

import java.util.Scanner;

public class Task_15 {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.println("Введите первое слово: ");
        String str1 = in.next();
        System.out.println("Введите второе слово: ");
        String str2 = in.next();

        System.out.println("При сложении слова " + str1 + " и слова " + str2 + " получилось: ");

        String str3 = (str1.substring(0, str1.length()/2)) +
                (str2.substring(str2.length()/2));
        System.out.println(str3);
    }
}

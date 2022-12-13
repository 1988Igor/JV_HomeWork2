package org.example;

import java.util.Scanner;

//1) Дана последовательность N целых чисел. Найти количество положительных чисел,
// после которых следует отрицательное число.
public class Task1 {
    public static void main(String[] args) {
        int a, b, count = 0, n;
        Scanner scanner = new Scanner(System.in);
        count = 0;
        System.out.println("Введите длину последовательности:");
        n = scanner.nextInt();
        System.out.println("Введите " + n + " целых чисел");
        b = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if ((a > 0) && (b < 0)) {
                count++;
            }
            b = a;
        }
        System.out.println("количество положительных чисел,\n" +
                "после которых следует отрицательное число = " + count);
        scanner.close();
    }
}
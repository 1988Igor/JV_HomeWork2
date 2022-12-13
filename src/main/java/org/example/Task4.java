package org.example;

//4) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

import java.util.Scanner;

public class Task4 {
    public static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] > arr[i + 1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = scanner.nextInt();
        System.out.println("Введите " + n + " елементов массива");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Верно ли, что последовательность является возрастающей? - " + isSorted(arr));
    }
}

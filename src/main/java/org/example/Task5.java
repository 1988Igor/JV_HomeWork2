package org.example;

//5) Дан массив целых чисел. Найти сумму элементов, у которых последняя и предпоследняя цифры равны.

public class Task5 {
    public static void main(String[] args) {

        int[] arr = {235, 422, 544, 655, 810, 105, 1455, 233, 14, 833};
        int sum = 0;
        for (int j : arr) {
            int firstNumber = j % 100 / 10;
            int secondNumber = j % 10;
            if (firstNumber == secondNumber) sum += j;
        }
        System.out.println("Сумма элементов, у которых последняя и предпоследняя цифры равны = " + sum);

    }
}

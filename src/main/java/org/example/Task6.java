package org.example;

//6) Дан массив целых чисел.
// Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
public class Task6 {
    public static void main(String[] args) {
        System.out.print("Измененный массив: ");
        int[] arr = {20, 20, -20, -5, 20, 20, 30, -7, 20, 1, 3, -30};
        int sum = 0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if ((arr[i] >= 10) && (arr[i] < 99)) sum += i;
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = sum;
            System.out.print(arr[i] + " ");
        }

    }
}

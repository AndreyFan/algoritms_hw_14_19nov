package de.telran.hw_14_19nov;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MainFindNumber {
    //  1) Первый элемент, встречающийся k раз в массиве
    //Дан массив из n целых чисел. Задача состоит в том,
    // чтобы найти первый элемент, который встречается k раз.
    //Если ни один элемент не встречается k раз, выведите -1.
    //Распределение целочисленных элементов может быть в любом диапазоне.
    //Ввод : {1, 7, 4, 3, 4, 8, 7}, k = 2
    //Вывод : 7
    //Объяснение: 7 и 4 встречаются 2 раза. Но 7 — это первое, которое встречается 2 раза.
    public static void main(String[] args) {
        int[] date = {1, 7, 4, 3, 4, 8, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите требуемое количество повторений любого числа в массиве: ");
        int k = scanner.nextInt();

        HashMap<Integer, Integer> frequencyMap = new HashMap<>(); // Считаем частоту чисел

        for (int num : date) { // перекачиваем массив в Мапу ( ключ- число, значение - подсчитываем число повторений)
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : date) {         //  поиск в нашей Мапе первого числа с частотой k
            if (frequencyMap.get(num) == k) {
                System.out.println(num);
                return; // Завершаем программу, т.к. нашли первое число
            }
        }
        // Если ни одно число не встречается k раз
        System.out.println(-1);
    }
}


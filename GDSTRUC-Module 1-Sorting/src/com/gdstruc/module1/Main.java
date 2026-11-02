package com.gdstruc.module1;

public class Main {

    public static void main(String[] args)

    {

        int[] numbers = new int[10];

        numbers[0] = 35;
        numbers[1] = 67;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -30;
        numbers[5] = 360;
        numbers[6] = 35;
        numbers[7] = -3;
        numbers[8] = 90;
        numbers[9] = 5;
        System.out.println("Before bubble sort: ");
        printArrayElements(numbers);
        bubbleSort(numbers);
        System.out.println("\n\nAfter bubble sort: ");
        printArrayElements(numbers);

        System.out.println("\n\nBefore selection sort: ");
        printArrayElements(numbers);
        selectionSort(numbers);
        System.out.println("\n\nAfter selection sort: ");
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }

    }
    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
